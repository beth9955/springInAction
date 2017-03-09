package chapter2;

public class Instrumetalist implements Perfomer {

	private String song;
	private Instrument instrument;
	
	public Instrumetalist() {}
	
	
	@Override
	public void perform() throws PerfomerException {
		// TODO Auto-generated method stub

		System.out.println("PLAYIND: "+song);
		instrument.play();
	}


	public String getSong() {
		return song;
	}


	public void setSong(String song) {
		this.song = song;
	}


	public Instrument getInstrument() {
		return instrument;
	}


	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

}
