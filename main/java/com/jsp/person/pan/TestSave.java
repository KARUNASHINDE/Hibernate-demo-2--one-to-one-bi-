package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

public class TestSave {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karuna");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Person person = new Person();
		person.setName("kagy");
		person.setEmail("kagu@123gmail.com");

		Pan pan = new Pan();
		pan.setGst_number("ksonf4534");
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();

	}

}
