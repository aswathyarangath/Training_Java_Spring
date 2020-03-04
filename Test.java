package com.wire;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

public static void main(String[] args) {
	Resource r=new ClassPathResource("WireFile.xml");
	BeanFactory factory=new XmlBeanFactory(r);

	Employee obj=(Employee) factory.getBean("id2");
	System.out.println(obj.toString());
}

}