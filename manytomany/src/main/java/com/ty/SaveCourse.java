package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCourse {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		Student s1 = new Student();
		s1.setSname("Ravi");
		s1.setAge(24);
		s1.setGender("Male");
		s1.setMarks(80);
		s1.setPhono(8861919022l);
		
		Student s2 = new Student();
		s2.setSname("Ravi");
		s2.setAge(24);
		s2.setGender("Male");
		s2.setMarks(80);
		s2.setPhono(8861919022l);
		
		Student s3 = new Student();
		s3.setSname("Ravi");
		s3.setAge(24);
		s3.setGender("Male");
		s3.setMarks(80);
		s3.setPhono(8861919022l);
		
		
		
		Course course=new Course();
		course.setCname("devops");
		course.setDuration("3 months");	
		course.setFee(15000);
		course.setTrainer("Prashanth");

		
		Course course2=new Course();
		course2.setCname("php");
		course2.setDuration("2 months");
		course2.setFee(10000);
		course2.setTrainer("ravi");
		
		Course course3=new Course();
		course3.setCname("java");
		course3.setDuration("3 months");	
		course3.setFee(20000);
		course3.setTrainer("kiran");
		
		Course course4=new Course();
		course4.setCname("sql");
		course4.setDuration("1 months");	
		course4.setFee(5000);
		course4.setTrainer("vikas");
		
		Course course5=new Course();
		course5.setCname("sql");
		course5.setDuration("1 months");	
		course5.setFee(5000);
		course5.setTrainer("vikas");
		
		
		
		List<Course> list = new ArrayList<Course>();
		list.add(course);
		list.add(course2);
		list.add(course3);
		
		List<Course> list1 = new ArrayList<Course>();
		list1.add(course);
		list1.add(course3);
		list1.add(course4);
		
		List<Course> list2 = new ArrayList<Course>();
		list2.add(course2);
		list2.add(course);
		list2.add(course5);
		
		
		
		s1.setCourse(list);
		s2.setCourse(list1);
		s3.setCourse(list2);
		
		entityTransaction.begin();
		entityManager.persist(s1);
		entityManager.persist(s2);
		entityManager.persist(s3);
		entityManager.persist(course);
		entityManager.persist(course2);
		entityManager.persist(course3);
		entityManager.persist(course4);
		entityManager.persist(course5);
		entityTransaction.commit();
		
		
		
		
		
		
	}
	
	
	

}
