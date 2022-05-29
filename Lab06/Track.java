package hust.soict.hedspi.aims.media;

public class Track {

	private String title;
	private float length;
	
	public Track(String title, float length) {
		super();
		this.title = title;
		this.length = length;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public boolean equals(Track track) {
		if(this.title.equals(track.getTitle())) return false;
		if(this.length != track.getLength()) return false;
		return true;
	}
}
