package chapter2;

public class PoeticJuggler extends Juggler implements Perfomer {

	private Poem poem;
	
	public PoeticJuggler(Poem poem){
		this.poem=poem;
	}
	
	public PoeticJuggler(int beansBasg, Poem poem){
		super(beansBasg);
		this.poem=poem;
	}
	
	@Override
	public void perform() throws PerfomerException{
		super.perform();
		System.out.println("while recitind..");
		poem.recite();
	}
	
	public void turnOnLight(){
		System.out.println("turnOnLight");
		
	}
	
	public void turnOffLight(){
		System.out.println("turnOffLight");
		
	}
	
}
