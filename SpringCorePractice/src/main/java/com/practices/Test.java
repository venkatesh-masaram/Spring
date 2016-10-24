package com.practices;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		BeanFactory applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		/*StudentDemo studentDemo = (StudentDemo) applicationContext.getBean(StudentDemo.class);
		Student student = (Student) applicationContext.getBean("student3");
		System.out.println(student.getDname());
		studentDemo.printStudent();
		System.out.println((Student) applicationContext.getBean("student"));
		System.out.println((Student) applicationContext.getBean("student2"));
		System.out.println((Student) applicationContext.getBean("student3"));
		
		System.out.println((Student) applicationContext.getBean("student"));
		System.out.println((Student) applicationContext.getBean("student2"));
		System.out.println((Student) applicationContext.getBean("student3"));*/
		/*
		A a = (A) applicationContext.getBean("a");
		A a1 = (A) applicationContext.getBean("a1");
		
		A a3 = (A) applicationContext.getBean("a");
		A a4 = (A) applicationContext.getBean("a1");
		
		System.out.println(a);
		System.out.println(a1);
		
		System.out.println(" a3 : "+a3);
		System.out.println(" a4 : "+a4);
		
		
		A a2 = new A();
		System.out.println(A.id);*/
		((ConfigurableApplicationContext)applicationContext).close();
		print(null);
	}
	
	
	
	public static void print(String a){
		System.out.println(" string ");
		System.out.println(a);
	}
	/*public static void print(Integer a){
		System.out.println(a);
	}*/
	public static void print(Object a){
		System.out.println(" object ");
		System.out.println(a);
	}
}
