package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.media.book.Book;
import hust.soict.hedspi.aims.media.disc.CompactDisc;
import hust.soict.hedspi.aims.media.disc.DigitalVideoDisc;

public abstract class Media implements Comparable<Media>{
	protected String title;
	protected String category;
	protected float cost;
	protected String id;
	
	public Media(String id, String title, float cost) {
		this.id = id;
		this.title = title;
		this.cost = cost;
	}
	
	public Media(String id, String title, String category, float cost) {
		this(id, title, cost);
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
	}
	public String getId() {
		return id;
	}
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if( obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Media other = (Media) obj;
		if (id != other.id){
			return false;
		};
		return true;
	}
	public int compareTo(Media media) {
		if (this instanceof Book && (media instanceof DigitalVideoDisc || media instanceof CompactDisc)) {
			return -1;
		}
		if(this instanceof DigitalVideoDisc && media instanceof CompactDisc)
			return -1;
		if(this instanceof CompactDisc && (media instanceof DigitalVideoDisc || media instanceof Book))
			return 1;
		if(this instanceof DigitalVideoDisc && media instanceof Book)
			return 1;
		return 0;
	}

}
