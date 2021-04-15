package lab7;

import java.util.ArrayList;

public class CompactDisc extends Disc {

	private String artist;
    private ArrayList<Track> tracks;
 	
	
	public CompactDisc(String title, String caterogy, float cost) {
		super(title, caterogy, cost);
		// TODO Auto-generated constructor stub
	}

	public CompactDisc(String title, String caterogy) {
		super(title, caterogy);
		// TODO Auto-generated constructor stub
	}

	public CompactDisc(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public CompactDisc(String title, String artist, ArrayList<Track> tracks) {
		super(title);
		this.artist = artist;
		this.tracks = tracks;
	}

    public CompactDisc(String title, String category, float cost, int length, String director, String artist, ArrayList<Track> tracks){
        super(title, category, cost, length, director);
        setArtist(artist);
        setTracks(tracks);
    }

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public ArrayList<Track> getTracks() {
		return tracks;
	}

	public void setTracks(ArrayList<Track> tracks2) {
		this.tracks = tracks2;
	}
	
	public void addTrack(Track track) {
        if(!tracks.contains(track))
        {
            tracks.add(track);
            System.out.println("Add" + track.getTitle() + " successfull");
        }else{
            System.out.println("Tracks have already contained " + track.getTitle());
        }  	
	}
    public void removeTrack(Track track)
    {
        if(tracks.contains(track))
        {
            tracks.remove(track);
            System.out.println("Remove" + track.getTitle() + " successfull");
        }else{
            System.out.println("Tracks do not contain " + track.getTitle());
        }
    }
    @Override
    public void play() {
        for (Track track : tracks)
        {
            track.play();
        }
    }
    
}
