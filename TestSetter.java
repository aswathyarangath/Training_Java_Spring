package com.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestSetter {
	public static void main(String[] args) {
		Resource r=new ClassPathResource("ApplicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		
		Customer b=(Customer)factory.getBean("cust2");
		System.out.println(b);
	}

}
