package main;

public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisk jungleDVD = new DigitalVideoDisk("Jungle"); 
		DigitalVideoDisk cinderellaDVD = new DigitalVideoDisk("Cinderella");
		
		swap(jungleDVD, cinderellaDVD); 
		System.out.println("jungle dvd title: " + jungleDVD.getTitle()); 
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
		//changeTitle(jungleDVD, cinderellaDVD.getTitle()); 
		//System.out.println("jungle dvd title: " + jungleDVD.getTitle());

	}
	public static void swap (DigitalVideoDisk o1,DigitalVideoDisk o2) {
		String tmp = o1.getTitle();
		o1.setTitle(o2.getTitle()); 
		o2.setTitle(tmp);
	}
	public static void changeTitle(DigitalVideoDisk dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisk(oldTitle);
	}

}
