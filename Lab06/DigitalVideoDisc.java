package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.Scanner;

public class DigitalVideoDisc extends Media {
    private String director;
    private int length;
    public static int max_str=10;
     
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public DigitalVideoDisc(String title, String category, String director) {
		super(title, category);
		this.director = director;
	}
	public DigitalVideoDisc(String title) {
		super(title);
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}
	
	public DigitalVideoDisc() {
		super();
	}
	
	public DigitalVideoDisc inputinformation() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("- Input dvd (title, category, cost, length, director): ");
		System.out.print("- Input the dvd title: ");
		String title = keyboard.nextLine();
		System.out.print("- Input the dvd category: ");
		String category = keyboard.nextLine();
		System.out.print("- Input the dvd cost: ");
		float cost = keyboard.nextFloat();
		System.out.print("- Input the dvd length: ");
		int length = keyboard.nextInt();
		System.out.print("- Input the dvd director: ");
		String director = keyboard.nextLine();
		DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, length, cost);
		return dvd;
	}
	
	public boolean search(String title) {
		title = title + " ";
		title = title.toLowerCase();
		String str = new String();
		str = getTitle().toLowerCase();
		char kytu;
		ArrayList<String> aString = new ArrayList<String>();
		int a=0, b=0, d=0;
		for(int i=0; i<title.length(); i++) {
	    	kytu = title.charAt(i);
	    	if(kytu == ' ') {
	    		aString.add(title.substring(b, i));
	    		b=i+1;
	    		a++;
	    	}
	    }
		for(String i : aString) {
			if(str.contains(i)) {
				d++;
			}
		}
		if(d==aString.size()) return true;
		else return false;
	}
}

