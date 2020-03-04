package SprinInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Inheritance {
	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("configure.xml");
		Employee e=(Employee)context.getBean("emp");
		System.out.println(e.getId());
		System.out.println(e.getName());
	}

}
