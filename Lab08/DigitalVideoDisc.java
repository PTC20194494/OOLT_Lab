package hust.soict.hedspi.aims.media.disc;

import hust.soict.hedspi.aims.media.Media;

public class DigitalVideoDisc extends Disc implements Playable, Comparable<Media> {


	protected String director;
	protected int length;
	
    public void setTitle(String title) {
        this.title = title;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    
    public void setCost(float cost) {
        this.cost = cost;
    }
    
	public void setDirector(String director) {
		this.director = director;
	}
	
	public boolean setLength(int length) {
		if(length > 0) {
			this.length = length;
			return true;
		}else 	
			return false;
	}
	
	public DigitalVideoDisc(String id, String title, float cost) {
		super(id, title, cost);
	}
	
	public DigitalVideoDisc(String id, String title, int length, float cost) {
		super(id, title,length, cost);
	}
	
	public DigitalVideoDisc(String id, String title, String category, int length, float cost ) {
		super(id, title, category,length, cost);
	}
	
	public DigitalVideoDisc(String id, String title, String category, int length, String director, float cost) {
		super(id, title, category, length, director, cost);
	}
			
	public boolean search(String title) {
		int  i = 0;
		String[] titleItems = title.split("\\s");
		String[] currentTitleItems = this.getTitle().split("\\s");
		for (String item : titleItems) {
			for (String titleItem: currentTitleItems)
			if (item.equals(titleItem)) {
				i++;
			}
		}
		if ( i == currentTitleItems.length) {
			return true;
		} else 
			return false;
	}

	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		
	}
	
	public int compareTo(Media media) {
		if(media instanceof DigitalVideoDisc) {
			if(this.getCost() < media.getCost())
				return -1;
			else if(this.getCost() == media.getCost())
				return 0;
			else return 1;
		}else {
			return super.compareTo(media);
		}
	}
	
	
}
