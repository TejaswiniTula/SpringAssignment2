package com.spring2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunnerImpl implements ApplicationRunner{
	
	@Autowired
	private Library library;
	
	@Autowired
	private Classroom classroom;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		library.displayBookDetails();
		classroom.displayStudentDetails();
	}

	public Library getlibrary() {
		return library;
	}

	public void setlibrary(Library library) {
		this.library = library;
	}

	public Classroom getclassroom() {
		return classroom;
	}

	public void setclassroom(Classroom classroom) {
		this.classroom = classroom;
	}
	
	
	
}
