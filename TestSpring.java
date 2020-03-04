package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
public static void main(String[] args){
	ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
Object book=context.getBean("b");
System.out.println(book);
}
}
