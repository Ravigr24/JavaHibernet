package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePerson {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		Person person1 =new Person();
		person1.setName("Ravi");
		person1.setAge(24);
		person1.setGender("male");
		person1.setPhno(9961919066l);
		
		Pan pan1 = new Pan();
		pan1.setPnumber("RYHPR3146R");
		pan1.setAddress("Bangalore");
		
		person1.setPan(pan1);
		pan1.setPerson(person1);
		
		
		
		entityTransaction.begin();
		entityManager.persist(pan1);
		entityManager.persist(person1);
		entityTransaction.commit();
	}

}
