package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePerson {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		
		Person p1= new Person();
		p1.setName("Ravikiran");
		p1.setAge(24);
		p1.setGender("Male");
		p1.setAddress("bangalore");
		p1.setPan("CYHPR3153G");
		p1.setPhno(8861919022l);
		
		
		Bank b1= new Bank();
		b1.setBankname("SBI");
		b1.setAccno(1454101011660l);
		b1.setType("Saviings");
		b1.setIfsc("SBI0004502");
		b1.setAddress("Bangalore");
		
		

		Bank b2= new Bank();
		b2.setBankname("HDFC");
		b2.setAccno(352459782655l);
		b2.setType("Saviings");
		b2.setIfsc("HDFC00058475");
		b2.setAddress("Bangalore");
		
		
		List<Bank> account= new ArrayList<Bank>();
		account.add(b1);
		account.add(b2);
		
		p1.setBank(account);
		b1.setPerson(p1);
		b2.setPerson(p1);
		
		entityTransaction.begin();
//		entityManager.persist(account);
		entityManager.persist(p1);
		entityManager.persist(b1);
		entityManager.persist(b2);
		entityTransaction.commit();
		
		
	}
	
	
	
	

}
