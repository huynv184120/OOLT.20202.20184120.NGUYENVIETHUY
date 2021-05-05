package lab9;

public class Disc extends Media {
	private int length;
	private String director;
	public Disc(String title) {
		super(title);
	}
	public int getLength() {
		return length;
	}

	public String getDirector() {
		return director;
	}
	
	public Disc(String title, String caterogy, float cost) {
		super(title, caterogy, cost);
		// TODO Auto-generated constructor stub
	}
	public Disc(String title, String caterogy) {
		super(title, caterogy);
		// TODO Auto-generated constructor stub
	}
	public Disc(String title, String caterogy, float cost , int length, String director) {
		super(title, caterogy, cost);
		 setLength(length);
	     setDirector(director);
		// TODO Auto-generated constructor stub
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("title : "+getTitle() + ", category :" + getCategory() + ", Director :  " +
                getDirector() + ", length : " + getLength() + ": Cost: " + getCost());
		
	}
	
	
	
}