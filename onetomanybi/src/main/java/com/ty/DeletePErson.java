package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletePErson {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person = entityManager.find(Person.class, 1);
		if(person!=null) {
				Bank bank = entityManager.find(Bank.class, 1);
				Bank bank1 = entityManager.find(Bank.class, 2);
			
			entityTransaction.begin();
			entityManager.remove(bank);
			entityManager.remove(bank1);
			entityManager.remove(person);
			entityTransaction.commit();
		}
	}

}
