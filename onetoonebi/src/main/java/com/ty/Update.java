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
		Person  person =entityManager.find(Person.class, 4);
		person.setName("manulumar");
		person.setGender("Female");
		
		Pan pan =entityManager.find(Pan.class, 4);
		pan.setPnumber("RAVI588RD");
		
		

		entityTransaction.begin();
		entityManager.merge(pan);
		entityManager.merge(person);
		entityTransaction.commit();
	}

}
