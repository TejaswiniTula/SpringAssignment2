package com.spring2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Bean 
	Book book() {
		return new Book("This is demo","Ria");
	}
	
	@Bean
	Student student() {
		return new Student("Ria",23);
	}
	
	@Bean
	Library library(Book book) {
		Library library=new Library();
		library.setbook(book);
		return library;
	}
	
	@Bean
	Classroom classroom(Student student) {
		return new Classroom(student);
	}

}
