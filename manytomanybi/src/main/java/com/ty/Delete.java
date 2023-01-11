package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Company company=entityManager.find(Company.class, 3);
		if(company!=null) {
			Employee employee =entityManager.find(Employee.class, 1);
			Employee employee2 =entityManager.find(Employee.class, 3);
			
		
		entityTransaction.begin();
		entityManager.remove(employee);
		entityManager.remove(employee2);
		entityManager.remove(company);
		entityTransaction.commit();
		}
	}

}
