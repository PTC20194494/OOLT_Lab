package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.Scanner;

public class CompactDisc extends Media {
	private String artist;
	private String director;
	private ArrayList<Track> trackliArrayList = new ArrayList<Track>();
	
	public CompactDisc() {
		super();
	}

	public CompactDisc(String title, String category, float cost ,String artist, String director, ArrayList<Track> trackliArrayList) {
		super(title, category, cost);
		this.artist = artist;
		this.director = director;
		this.trackliArrayList = trackliArrayList;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public ArrayList<Track> getTrackliArrayList() {
		return trackliArrayList;
	}

	public void setTrackliArrayList(ArrayList<Track> trackliArrayList) {
		this.trackliArrayList = trackliArrayList;
	}

	public float getTotalLength() {
		float sum=0;
		for (Track i : trackliArrayList){
			sum = sum + i.getLength();
		}
		return sum;
	}
	
	public void displayTrack() {
		int i;
		System.out.println("- Total length: "+getTotalLength());
		for(i=0;i<trackliArrayList.size();i++) {
			System.out.format("Information of Track %d: %s - %f\n",i+1,trackliArrayList.get(i).getTitle(),trackliArrayList.get(i).getLength());
		}
	}
	public String toString() {
		return "CD "+super.toString()+" Artist: "+artist+" Director: "+director+" Total Length: "+getTotalLength()+" Cost: "+super.getCost();
	}
	
	public CompactDisc inputInformation() {
		Scanner keyboard = new Scanner(System.in);
		int n;
		String titleTrack;
		float lengthTrack;
		ArrayList<Track> trackList = new ArrayList<Track>();
		System.out.print("- Input cd (title, category, artist, director, cost): ");
		System.out.print("- Input the cd title: ");
		String title= keyboard.nextLine();
		System.out.print("- Input the cd category: ");
		String category = keyboard.nextLine();
		System.out.print("- Input the artist: ");
		String artist = keyboard.nextLine();
		System.out.print("- Input the director: ");
		String director = keyboard.nextLine();
		System.out.print("- Input the cost: ");
		float cost = keyboard.nextFloat();
		System.out.print("- Input number of tracks: ");
		n = keyboard.nextInt();
		System.out.println("- Input the information of each track: ");
		for(int i=0;i<n;i++) {
			System.out.println("Track "+(i+1));
			System.out.println("- Title: ");
			titleTrack = keyboard.nextLine();
			System.out.println("- Length: ");
			lengthTrack = keyboard.nextFloat();
			trackList.add(new Track(titleTrack, lengthTrack));
		}
		check(trackliArrayList);
		CompactDisc cDisc = new CompactDisc(title, category, cost, artist, director, trackList);
		return cDisc;
	}
	
	public void check(ArrayList<Track> trackList) {
		int j;
		for(int i=0;i<trackList.size();i++) {
			for(j=i+1;j<trackList.size();j++) {
				if(trackList.get(i).equals(trackList.get(j))) {
					trackList.remove(j);
					j--;
				}
			}
		}
	}
}
