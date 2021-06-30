package com.example.main;

import org.hibernate.Session;

import com.example.enity.Menu;
import com.example.util.HibernateUtil;

public class HibernateApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		

		session.close();
	}

}
