package com.ty.mto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCAbPerson {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Cab cab = new Cab();
		cab.setDname("raju");
		cab.setType("SUV");
		cab.setBrand("Maruthi ");
		cab.setCost(350);
		cab.setPhno(8861919022l);
		
		Cab cab1 = new Cab();
		cab1.setDname("manu");
		cab1.setType("i20");
		cab1.setBrand("honda ");
		cab1.setCost(250);
		cab1.setPhno(9972463522l);
		
		Person person1 = new Person();
		person1.setName("Ravi");
		person1.setAge(24);
		person1.setGender("MAle");
		person1.setPhno(6360673720l);
		
		
		cab.setPerson(person1);
		cab1.setPerson(person1);
		
		entityTransaction.begin();
		entityManager.persist(cab);
		entityManager.persist(cab1);
		entityManager.persist(person1);
		entityTransaction.commit();
		
		
		
		
		
		
		
		
				}
}
