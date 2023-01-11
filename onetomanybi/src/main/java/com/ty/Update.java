package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person = entityManager.find(Person.class, 3);
		person.setName("manulumar");
		person.setGender("male");
		
		Bank  bank = entityManager.find(Bank.class, 5);
		bank.setAccno(114545785556l);
		Bank  bank1 = entityManager.find(Bank.class, 6);
		bank1.setAccno(454545785556l);
		
		
		entityTransaction.begin();
		entityManager.merge(bank);
		entityManager.merge(bank1);
		entityManager.merge(person);
		entityTransaction.commit();
		
	}

}
