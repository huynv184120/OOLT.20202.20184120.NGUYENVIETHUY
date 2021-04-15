package lab7;

public class Dict extends Media {
	private int length;
	private String director;
	public Dict(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public Dict(String title, String caterogy, float cost) {
		super(title, caterogy, cost);
		// TODO Auto-generated constructor stub
	}
	public Dict(String title, String caterogy) {
		super(title, caterogy);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
