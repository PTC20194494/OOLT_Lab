package hust.soict.hedspi.aims.media;


public abstract class Media {
	protected String title;
	protected String category;
	protected float cost;
	protected String id;
	
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
	ublic float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getId() {
		return id;
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
	public Media(String id, String title, float cost) {
		this.id = id;
		this.title = title;
		this.cost = cost;
	}
	
	public Media(String id, String title, String category, float cost) {
		this(id, title, cost);
		this.category = category;
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
