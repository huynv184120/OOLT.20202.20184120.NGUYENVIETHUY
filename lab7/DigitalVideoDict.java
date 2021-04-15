package lab7;

public class DigitalVideoDict extends Dict implements Playable{

	public DigitalVideoDict(String title, String caterogy, float cost) {
		super(title, caterogy, cost);
		// TODO Auto-generated constructor stub
	}

	public DigitalVideoDict(String title, String caterogy) {
		super(title, caterogy);
		// TODO Auto-generated constructor stub
	}

	public DigitalVideoDict(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
	@Override
	    public void play() {
	        System.out.println("playing DVD: " + getTitle());
	        System.out.println("dvd length: " + getLength());
	    }
	}

