package com.ty.mto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class GetCab {
	
	public static void main(String[] args) {
		 
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		
		Query query=entityManager.createQuery("select c from Cab c");
		List<Cab> cabs =query.getResultList();
		
		for (Cab cab : cabs) {
			System.out.println("Cab id is "+cab.getCno());
			System.out.println("Cab name is "+cab.getDname());
			System.out.println("Cab type is "+cab.getType());
			System.out.println("Cab brand is "+cab.getBrand());
			System.out.println("Cab phno is "+cab.getPhno());
			System.out.println("Cab cost is "+cab.getCost());
			System.out.println("Cab person is "+cab.getPerson());
			
			System.out.println("***************************************");
		}
		
	}

}
