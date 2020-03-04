package StringCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestCollection {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
		Object o=context.getBean("library");
		Library l=(Library) o;
		System.out.println(l);
		
	}

}
