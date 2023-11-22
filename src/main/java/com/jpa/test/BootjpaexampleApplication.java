package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.StudentRepository;
import com.jpa.test.entity.Student;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
	ApplicationContext context	=SpringApplication.run(BootjpaexampleApplication.class, args);
	
StudentRepository studentRepository=context.getBean(StudentRepository.class);


Student student= new Student();

student.setId(1999999);
student.setName("kartikeya");
student.setAge(20);
student.setSalary(3000000);



Student student1 =studentRepository.save(student);

System.out.println(student1);

	}

}
