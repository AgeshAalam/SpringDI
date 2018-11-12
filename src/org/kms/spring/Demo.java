package org.kms.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Demo {
	public static void main(String[] args) {
		// Spring uses Reflection API to create object
		// spring style
		Resource resource = new ClassPathResource("applicationConfig.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Employee e = (Employee) factory.getBean("emp");
		e.sayHello();
		System.out.println(e);
		
		Employee e2 = (Employee) factory.getBean("emp2");
		e2.sayHello();
		System.out.println(e2);
	}
}
