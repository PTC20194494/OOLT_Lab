package hust.soict.hedspi.aims.media;
import java.util.ArrayList;
import java.util.Scanner;

public class Book extends Media {
	private ArrayList<String> authors = new ArrayList<String>();

	public Book() {
		super();
	}
	
	public Book(String title, String category, float cost, ArrayList<String> authors) {
		super(title, category, cost);
		this.authors = authors;
	}

	public void addAuthor(String author){
	   this.authors.add(author);
	}
	public void addAuthors (ArrayList<String> authors){
	   this.authors.addAll(authors);
	}
	
	public ArrayList<String> getAuthors(){
	    return this.authors;
	}
	
	public String toString(){
	    return "Book"+ super.toString()+ "Authors: " + this.authors.toString();
	}
	
	public Book inputInformation() {
		// TODO Auto-generated method stub
		System.out.print("- Input book (title, category, cost, length, director): ");
		Scanner keyboard = new Scanner(System.in);
		System.out.print("- Input book title: ");
		String title = keyboard.nextLine();
		System.out.print("- Input book category: ");
		String category = keyboard.nextLine();
		System.out.print("- Input book cost: ");
		float cost = keyboard.nextFloat();	
		ArrayList<String> auList = new ArrayList<String>();
		int n;
		System.out.print("Input the number of authors: ");
		n = keyboard.nextInt();
		for(int i=0; i<n; i++) {
			System.out.print("- Input the author" + i+1);
			auList.add(keyboard.nextLine());
		}
		return new Book(title, category, cost, auList);
	}
	
}
