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
@Table(name="menuoption")
public class MenuOption  implements Serializable{

	
/**
	 * 
	 */
	private static final long serialVersionUID = 4746685743528759143L;

/**
	 * 
	 */


/*	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="menu_option_id", nullable=false)*/
	
	@Id
	@Column(name = "menu_option_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int menuoptionid;	
	
	@ManyToOne
	@JoinColumn(name="sub_menu_id", insertable=true, updatable=true, nullable=false)
	private SubMenu subMenu;
	
	@Column(name="menu_option", nullable=false)
	private String menuoption;	
	
	@Column(name="menu_option_sequence_id", nullable=false)
	private int menuoptionsequenceid;
	
	@Column(name="show_menu_option", nullable=false)
	private boolean showmenuoption = true;
	
	@Version
	private Timestamp version;

	public int getMenuoptionid() {
		return menuoptionid;
	}

	public void setMenuoptionid(int menuoptionid) {
		this.menuoptionid = menuoptionid;
	}

	public SubMenu getSubMenu() {
		return subMenu;
	}

	public void setSubMenu(SubMenu subMenu) {
		this.subMenu = subMenu;
	}

	public String getMenuoption() {
		return menuoption;
	}

	public void setMenuoption(String menuoption) {
		this.menuoption = menuoption;
	}

	public int getMenuoptionsequenceid() {
		return menuoptionsequenceid;
	}

	public void setMenuoptionsequenceid(int menuoptionsequenceid) {
		this.menuoptionsequenceid = menuoptionsequenceid;
	}

	public boolean isShowmenuoption() {
		return showmenuoption;
	}

	public void setShowmenuoption(boolean showmenuoption) {
		this.showmenuoption = showmenuoption;
	}

	public Timestamp getVersion() {
		return version;
	}

	public void setVersion(Timestamp version) {
		this.version = version;
	}
	
	
	
	

}
