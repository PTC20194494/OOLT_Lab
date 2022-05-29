package hust.soict.hedspi.aims.media;

import java.util.Scanner;

public class Media {
	private String title;
	private String Category;
	private float cost;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		this.Category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public Media(String title) {
		super();
		this.title = title;
	}
	public Media(String title, String category) {
		super();
		this.title = title;
		this.Category = category;
	}
	public Media(String title, String category, float cost) {
		super();
		this.title = title;
		this.Category = category;
		this.cost = cost;
	}
	public Media() {
		super();
	}

	public Media inputInformation() {
		// TODO Auto-generated method stub
		System.out.print("- Input media (title, category, cost, length, director): ");
		Scanner keyboard = new Scanner(System.in);
		System.out.print("- Input the dvd title: ");
		String title = keyboard.nextLine();
		System.out.print("- Input the dvd category: ");
		String category = keyboard.nextLine();
		System.out.print("- Input the dvd cost: ");
		float cost = keyboard.nextFloat();		
		Media media = new Media(title, category, cost);
		return media;
	}
}
