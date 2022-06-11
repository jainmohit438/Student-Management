package com.Student.Management;

import com.Student.Management.Entity.Student;
import com.Student.Management.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagementApplication.class, args);
	}
	/*
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello");
		Student student=new Student("M","J","mj@g.com");
		studentRepository.save(student);
		//Student student1=new Student("Mohit","Jain","jainmohit@gmail.com");
		//studentRepository.save(student1);

		/*Student student2=new Student("Harshit","Singhal","harshit@gmail.com");
		studentRepository.save(student2);

		/*Student student3=new Student("Anukul","Agrawal","anukul@gmail.com");
		studentRepository.save(student3);

	}*/
}
