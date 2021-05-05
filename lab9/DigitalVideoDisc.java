package lab9;

public class DigitalVideoDisc extends Disc implements Playable, Comparable<Object>{

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

	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub'
		if (obj.getClass() != getClass()) throw new AssertionError("Error");
		DigitalVideoDisc obj1 =(DigitalVideoDisc)obj;
		if(getCost()>obj1.getCost())return 1;
		if(getCost()<obj1.getCost())return -1;
		if(getLength()>obj1.getLength())return 1;
		if(getLength()<obj1.getLength())return -1;
		return  getTitle().compareTo(obj1.getTitle());
	}
	}

