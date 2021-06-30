package com.example.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.example.enity.Menu;
import com.example.enity.MenuOption;
import com.example.enity.SubMenu;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			Configuration configuration = new Configuration();
			Properties props = new Properties();
			props.put("hibernate.connection.username", "root");
			props.put("hibernate.connection.password", "samuel90");
			props.put("hibernate.connection.driver_class", "org.mariadb.jdbc.Driver");
			props.put("hibernate.connection.dialect", "org.hibernate.dialect.MariaDB53Dialect");
			props.put("hibernate.connection.url", "jdbc:mariadb://127.0.0.1:3306/hibernate_training");
			props.put("hibernate.hbm2ddl.auto", "update");
			props.put("hibernate.show_sql", "true");
			configuration.setProperties(props);

			configuration.addAnnotatedClass(Menu.class);
			configuration.addAnnotatedClass(SubMenu.class);
			configuration.addAnnotatedClass(MenuOption.class);
			SessionFactory sessionFactory = configuration.buildSessionFactory(
					new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());

			return sessionFactory;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("There was an error building the factory");
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
