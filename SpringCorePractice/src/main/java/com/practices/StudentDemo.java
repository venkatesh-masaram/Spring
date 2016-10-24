package com.practices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDemo {

	@Autowired
	private Student student3;
	
	/*@Autowired
	public StudentDemo(Student student2){
		this.student2 = student2;
	}*/

	
	public void printStudent(){
		System.out.println(" name "+student3.getName());
	}
}
