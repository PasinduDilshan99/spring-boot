package com.example.cruddemo;

import com.example.cruddemo.dao.StudentDAO;
import com.example.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner->{
//		 createStudent(studentDAO);
//			createMultipleStudents(studentDAO);
//			readStudent(studentDAO);
//			queryForStudent(studentDAO);
//			queryForStudentByLastName(studentDAO);
//			updateStudent(studentDAO);
//			deleteStudent(studentDAO);
			deleteAll(studentDAO);
		};
	}

	private void deleteAll(StudentDAO studentDAO) {
		System.out.println("Delete all students");
		int numa = studentDAO.deleteAll();
		System.out.println("Delete count" + numa);

	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 5;
		System.out.println("Delete Student Id: "+ studentId);
		studentDAO.delete(studentId);


	}

	private void updateStudent(StudentDAO studentDAO) {
		int studentId = 1;
		System.out.println("Getting student with id: " + studentId);
		Student myStudent = studentDAO.findById(studentId);

		System.out.println("update the Student");
		myStudent.setFirstName("apple");
		studentDAO.update(myStudent);
		System.out.println(myStudent);
	}

	private void queryForStudentByLastName(StudentDAO studentDAO) {
		List<Student> theStudents = studentDAO.findByLastName("def");
		for (Student tempStudent: theStudents){
			System.out.println(tempStudent);
		}
	}

	private void queryForStudent(StudentDAO studentDAO) {
		// get All Students
		List<Student> theStudent = studentDAO.FindAll();

		// List All Students
		for (Student tempStudent : theStudent){
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {

		//create the student object
		System.out.println("create the student");
		Student tempStudent = new Student("amara","kamala","amara@gmail.com");

		// save the student object
		studentDAO.save(tempStudent);

		// display id of the saved student
		int theId = tempStudent.getId();
		System.out.println("display the Id : " + theId);

		// retrieve student based on the id: primary key
		System.out.println("Retrieve the student by  id : "+ theId);
		Student myStudent = studentDAO.findById(theId);

		// display student
		System.out.println("found the student" + myStudent);
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		//create the students object
		System.out.println("creating new students");
		Student tempStudent1 = new Student("abc","def","abc@gmail.com");
		Student tempStudent2 = new Student("ghi","jkl","ghi@gmail.com");
		Student tempStudent3 = new Student("mno","pqr","mno@gmail.com");

		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	}

	private void createStudent(StudentDAO studentDAO) {

		//create the student object
		System.out.println("creating new student");
		Student tempStudent = new Student("Paul","Doe","Paul@gmail.com");

		// save the student object
		System.out.println("save the student");
		studentDAO.save(tempStudent);


		// display id of the saved student
		System.out.println("save student id :" + tempStudent.getId());
	}
}
