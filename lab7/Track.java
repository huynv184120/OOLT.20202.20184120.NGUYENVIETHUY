package lab7;

public class Track implements Playable{
    private String title;
    private int length;

    public Track(String title, int length) {
        setTitle(title);
        setLength(length);
    }

    public String getTitle() {
        return title;
    }
    public int getLength() {
        return length;
    }
    
    
    public void setTitle(String title) {
		this.title = title;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
    public void play() {
        System.out.println("Playing DVD: " + getTitle());
        System.out.println("DVD length: " + getLength());
    }
}