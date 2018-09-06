package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("config.xml");
		Product p=(Product)c.getBean("pObj");
		System.out.println(p);

	}

}
