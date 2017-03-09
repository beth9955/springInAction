package chapter2;

public class SonnetPoem implements Poem {
	
	private static String LINES="나는 바람과 같이 어디론가 훌쩍";
	
	public SonnetPoem() {}
	
	@Override
	public void recite() {
		System.out.println(LINES);
		
	}

}
