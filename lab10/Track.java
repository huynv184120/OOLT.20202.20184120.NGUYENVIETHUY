package lab10;

public class Track implements Playable , Comparable<Object> {
	private String title;
	private int length;
	@Override
    public void play() throws PlayerException 
{
	if(this.getLength() > 0) {
        System.out.println("playing DVD: " + getTitle());
        System.out.println("dvd length: " + getLength());
    }
	else {
		throw new PlayerException("ERROR: DVD length is non positive");
	}
}
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		if (obj.getClass() != getClass()) throw new AssertionError("Error");
		Track obj1 =(Track)obj;
		if(length>obj1.getLength())return 1;
		if(length<obj1.getLength())return -1;
		return 0;
	}
	public Track(String title, int length) {
        setTitle(title);
        setLength(length);
    }
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	

}
