package com.hibernate.training;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hibernate.training.config.HibernateConfiguration;

public class HibernateTrainingApplication {

	public static void main(String[] args) throws InterruptedException, SQLException {
		System.out.println("This is the start of the PT Spring Hibernate application");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfiguration.class);

	}
}
