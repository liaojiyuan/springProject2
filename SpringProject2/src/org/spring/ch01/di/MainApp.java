package org.spring.ch01.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ExampleBean3 bean3=context.getBean("exampleBean3",ExampleBean3.class);
		System.out.println(bean3);
	}

}
