package com.example.enity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "menu")
public class Menu {

	@Id
	@Column(name = "menu_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int menuid;

	@Column(name = "menu", nullable = false)
	private String menu;

	@Column(name = "menu_active", nullable = true)
	private boolean menuactive;

	@Version
	private Timestamp version;

	public int getMenuid() {
		return menuid;
	}

	public void setMenuid(int menuid) {
		this.menuid = menuid;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public boolean isMenuactive() {
		return menuactive;
	}

	public void setMenuactive(boolean menuactive) {
		this.menuactive = menuactive;
	}

	public Timestamp getVersion() {
		return version;
	}

	public void setVersion(Timestamp version) {
		this.version = version;
	}

}
