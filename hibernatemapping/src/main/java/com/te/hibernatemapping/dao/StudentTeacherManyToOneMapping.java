package com.te.hibernatemapping.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.te.hibernatemapping.dto.*;

public class StudentTeacherManyToOneMapping {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("empdemo");
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		// creating
//		Student student1 = new Student("Dileep", "male");
//		Student student2 = new Student("Salman", "male");
//		Student student3 = new Student("Ritu", "female");
//		Teacher teacher = new Teacher();
//		teacher.setTeacherName("Ramya");
//		student1.setTeacher(teacher);
//		student2.setTeacher(teacher);
//		student3.setTeacher(teacher);
//		createEntityManager.persist(student1);
//		createEntityManager.persist(student2);
//		createEntityManager.persist(student3);
		//Student student1 = createEntityManager.find(Student.class, 1);
		//Student student2 = createEntityManager.find(Student.class, 2);
		//Student student3 = createEntityManager.find(Student.class, 3);
		//Teacher teacher1 = createEntityManager.find(Teacher.class, 1);
		//try {
			// read
			//System.out.println("StudentId : " + student1.getStudentId());
			//System.out.println(student1.getStudentName()+" has "+teacher1.getTeacherName());
			//System.out.println(student2.getStudentName()+" has "+teacher1.getTeacherName());
			//System.out.println(student3.getStudentName()+" has "+teacher1.getTeacherName());
			//System.out.println("StudentId : " + student2.getStudentName());
			//System.out.println("StudentId : " + student3.getStudentName());
			//System.out.println("StudentId : " + student1.getStudentGender());
			//System.out.println("Student Teacher : " + student1.getTeacher().getTeacherName());
			//System.out.println("Student Teacher : " + student2.getTeacher().getTeacherName());
			//System.out.println("Student Teacher : " + student3.getTeacher().getTeacherName());
			// System.out.println("Teacher name : "+teacher1.getTeacherName());
			
			//update
			//student1.setStudentGender("female");
			
			//delete
			//student1.setStudentGender(null);
			//createEntityManager.remove(student1);

		//} catch (Exception e) {
		//	System.out.println("data not present");
		//} finally {

		//	transaction.commit();
		//	createEntityManager.close();
		//	entityManagerFactory.close();
		//}
	}

}
