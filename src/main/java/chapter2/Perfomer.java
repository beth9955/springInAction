package chapter2;

public interface Perfomer{
	
	void perform()  throws PerfomerException;
	
}


class PerfomerException extends Exception{
	public PerfomerException() {
		// TODO Auto-generated constructor stub
		super();
	}
}