package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletePErson {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person  person =entityManager.find(Person.class, 2);
		if(person!=null) {
			Pan pan = entityManager.find(Pan.class, 2);
			
			entityTransaction.begin();
			entityManager.remove(pan);
			entityManager.remove(person);
			entityTransaction.commit();
		}
	}

}
