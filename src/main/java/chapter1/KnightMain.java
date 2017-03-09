package chapter1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

	public static void main(String args[]) throws QuestExeption{
		ApplicationContext context=new ClassPathXmlApplicationContext("chapter1.xml");
		
		Kinght kinght=(Kinght)context.getBean("knight");
		kinght.embarckOnQuest();
	}
}
