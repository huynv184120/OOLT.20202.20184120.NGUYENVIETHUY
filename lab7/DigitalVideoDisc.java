package lab7;

public class DigitalVideoDisc extends Disc implements Playable{

	public DigitalVideoDisc(String title, String caterogy, float cost) {
		super(title, caterogy, cost);
		// TODO Auto-generated constructor stub
	}

	public DigitalVideoDisc(String title, String caterogy) {
		super(title, caterogy);
		// TODO Auto-generated constructor stub
	}

	public DigitalVideoDisc(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
    public DigitalVideoDisc(String title, String category, float cost, int length, String director) {
        super(title, category, cost, length, director);
    }
	@Override
	    public void play() {
	        System.out.println("playing DVD: " + getTitle());
	        System.out.println("dvd length: " + getLength());
	    }
	}

