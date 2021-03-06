package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class DrawingApp {
	public static void main(String []args) {
		//Triangle triangle = new Triangle();
		//no new method for instantiating objects in spring
				//1. Bean factory method
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));		
//		Triangle triangle=(Triangle)factory.getBean("triangle");  //id of bean		

		//2. ApplicationContext additional features
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle=(Triangle)context.getBean("triangle"); 	
	triangle.draw();		
	}
}
