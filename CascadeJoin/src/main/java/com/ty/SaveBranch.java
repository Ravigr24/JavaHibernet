package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBranch {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Bank bank = new Bank();
		bank.setName("SBI");
		bank.setWebsite("ww.sbi.com");
		
		Bank bank1 = new Bank();
		bank1.setName("HDFC");
		bank1.setWebsite("ww.hdfc.com");
		
		Branch branch = new Branch();
		branch.setBname("basavangudi");
		branch.setLocation("near metrostation");
		branch.setIfsc("SBIN045415");
		branch.setPhno(9874563201l);
		
		Branch branch1 = new Branch();
		branch1.setBname("basavangudi");
		branch1.setLocation("vv foodstreet");
		branch1.setIfsc("HDFC045462");
		branch1.setPhno(9874653201l);
		
		Branch branch2 = new Branch();
		branch2.setBname("jayanagar");
		branch2.setLocation("near metrostation");
		branch2.setIfsc("SBIN045425");
		branch2.setPhno(9874562301l);
		
		Branch branch3 = new Branch();
		branch3.setBname("jayanagar");
		branch3.setLocation("near busstand");
		branch3.setIfsc("HDFC09858");
		branch3.setPhno(9847563201l);
		
		List<Branch> list =new ArrayList<Branch>();
		list.add(branch);
		list.add(branch2);
		
		List<Branch> list1 =new ArrayList<Branch>();
		list1.add(branch1);
		list1.add(branch3);
		
		bank.setBranchs(list);
		bank1.setBranchs(list1);
		branch.setBank(bank);
		branch1.setBank(bank1);
		branch2.setBank(bank);
		branch3.setBank(bank1);

		
		
		entityTransaction.begin();
		entityManager.persist(bank);
		entityManager.persist(bank1);
		entityTransaction.commit();
		
	}

}
