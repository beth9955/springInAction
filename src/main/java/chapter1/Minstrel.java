package chapter1;

import org.aspectj.lang.annotation.Aspect;

public class Minstrel {

	public void singBeforeQuest(){
		System.out.println("Fa la la; The kinight in so brave!");
	}
	
	public void singAfterQuest(){
		System.out.println("Tee hee he; the brave knight did embark on a quest");
	}
}
