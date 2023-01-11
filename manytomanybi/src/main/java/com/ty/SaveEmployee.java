package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmployee {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Company company = new Company();
		company.setCname("Infosys");
		company.setGst("TRYGG87988");
		company.setLocation("mysore");
		company.setPhno(9874563201l);
		company.setWebsite("www.infosys.com");
		
		Company company1 = new Company();
		company1.setCname("TCS");
		company1.setGst("TRYGdf67988");
		company1.setLocation("bangalore");
		company1.setPhno(98745645501l);
		company1.setWebsite("www.tcs.com");
		
		Company company2 = new Company();
		company2.setCname("IBM");
		company2.setGst("IBMYGG87988");
		company2.setLocation("hydarabad");
		company2.setPhno(98745785201l);
		company2.setWebsite("www.ibm.com");
		
		
		Employee employee = new Employee();
		employee.setEname("ravi");
		employee.setSal(45000);
		employee.setDesignation("Softeware developer");
		employee.setCompname("infosys");
		
		Employee employee1 = new Employee();
		employee1.setEname("kiran");
		employee1.setSal(35000);
		employee1.setDesignation("Softeware developer");
		employee1.setCompname("tcs");
		
		Employee employee2 = new Employee();
		employee2.setEname("prashu");
		employee2.setSal(35000);
		employee2.setDesignation("Softeware tester");
		employee2.setCompname("ibm");
		
		Employee employee3 = new Employee();
		employee3.setEname("babu");
		employee3.setSal(55000);
		employee3.setDesignation("Senior Softeware developer");
		employee3.setCompname("tcs");
		
		
		List<Company> list1 = new ArrayList<Company>();
		list1.add(company2);
		list1.add(company1);
		
		List<Company> list2 = new ArrayList<Company>();
		list2.add(company);
		list2.add(company2);
		
		List<Employee> emp1 = new ArrayList<Employee>();
		emp1.add(employee);
		emp1.add(employee2);
		
		List<Employee> emp2 = new ArrayList<Employee>();
		emp2.add(employee1);
		emp2.add(employee3);
		
		
		company.setEmployees(emp1);
		company1.setEmployees(emp2);
		company2.setEmployees(emp1);
		
		employee.setCompanies(list1);
		employee1.setCompanies(list2);
		employee2.setCompanies(list2);
		employee3.setCompanies(list1);
		
		entityTransaction.begin();
		entityManager.persist(employee);
		entityManager.persist(employee1);
		entityManager.persist(employee2);
		entityManager.persist(employee3);
		entityManager.persist(company);
		entityManager.persist(company1);
		entityManager.persist(company2);
		entityTransaction.commit();
	
		
		
	}

}
