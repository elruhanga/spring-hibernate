package com.example.enity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="submenu")
public class SubMenu  implements Serializable{

	
/**
	 * 
	 */
	private static final long serialVersionUID = 4563928765939745721L;

/*	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sub_menu_id", nullable=false)*/
	@Id
	@Column(name = "sub_menu_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int submenuid;
	
	@Column(name="sub_menu", nullable=true)
	private String submenu;
	
	@Column(name="sub_menu_sequence_id", nullable=false)
	private int submenusequenceid;
	
	@ManyToOne
	@JoinColumn(name="menu_id", insertable=true, updatable=true, nullable=false)
	private Menu menu;
	
	@Column(name="sub_menu_option_type", nullable=true)
	private String submenuoptiontype;
	
	@Column(name="sub_menu_active", nullable=true)
	private boolean submenuactive;
	
	
	@Version
	private Timestamp version;

	public int getSubmenuid() {
		return submenuid;
	}

	public void setSubmenuid(int submenuid) {
		this.submenuid = submenuid;
	}

	public String getSubmenu() {
		return submenu;
	}

	public void setSubmenu(String submenu) {
		this.submenu = submenu;
	}

	public int getSubmenusequenceid() {
		return submenusequenceid;
	}

	public void setSubmenusequenceid(int submenusequenceid) {
		this.submenusequenceid = submenusequenceid;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public String getSubmenuoptiontype() {
		return submenuoptiontype;
	}

	public void setSubmenuoptiontype(String submenuoptiontype) {
		this.submenuoptiontype = submenuoptiontype;
	}

	public boolean isSubmenuactive() {
		return submenuactive;
	}

	public void setSubmenuactive(boolean submenuactive) {
		this.submenuactive = submenuactive;
	}

	public Timestamp getVersion() {
		return version;
	}

	public void setVersion(Timestamp version) {
		this.version = version;
	}
	
	
	
	
}
