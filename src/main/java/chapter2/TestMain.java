package chapter2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String args[]) throws PerfomerException{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("chapter2.xml");
//		Perfomer perfomer = (Perfomer)context.getBean("duke");
//		Perfomer perfomer = (Perfomer)context.getBean("poeicDuke");
//		Perfomer perfomer = (Perfomer)context.getBean("kenny");
		Perfomer perfomer = (Perfomer)context.getBean("carl");
		
		perfomer.perform();
		
	}
}
