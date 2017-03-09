package chapter2;

public class Juggler implements Perfomer {

	private int beanBags=3;
	
	public Juggler(){}
	
	public Juggler(int beanBags){
		this.beanBags=beanBags;
	}
	
	@Override
	public void perform() throws PerfomerException {
		System.out.println("Juggling "+beanBags);
	}

}
