package StringCollection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import StringCollection.Question;

public class TestMap {
	public static void main(String[] args) {
		Resource r=new ClassPathResource("applicationcontext.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		
		Question b=(Question)factory.getBean("q");
		b.displayInfo();

}
}
