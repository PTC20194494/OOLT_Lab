package main;

public class Order {
	public static final int MAX_ORDERED = 10;
	private DigitalVideoDisk itemsOrdered[] = new DigitalVideoDisk[MAX_ORDERED];
	int QtyOrdered = 0;
	private MyDate dateOrdered = new MyDate();
	
	public static final int MAX_LIMITED_ORDERED = 5;
	private static int nbOrder = 0;
	
	public Order() {
		if(nbOrder >= MAX_LIMITED_ORDERED) {
			throw new IllegalArgumentException("Out Limit!");	
		}else {
			nbOrder++;
		}
	}
	
	public void addDigitalVideoDisk(DigitalVideoDisk disc) {
		if(QtyOrdered >= MAX_ORDERED) {
			System.out.println("Full!");
		}else {
			this.QtyOrdered++;
		    itemsOrdered[QtyOrdered-1] = disc; 
		}
		
	}
	public void addDigitalVideoDisk(DigitalVideoDisk dvd1,DigitalVideoDisk dvd2) {
		if(QtyOrdered + 2 >= MAX_ORDERED) {
			System.out.println("Full!");
		}else {
			this.QtyOrdered += 2;
		    itemsOrdered[QtyOrdered-1] = dvd1;
		    itemsOrdered[QtyOrdered] = dvd2;
		}
		
	}
	public void addDigitalVideoDisk(DigitalVideoDisk[] dvdlist) {
		int i;
		int k;
		if(QtyOrdered + dvdlist.length >= MAX_ORDERED) {
			System.out.println("Full!");
		}else {
			for(i = QtyOrdered - 1, k = 0; i < MAX_ORDERED ; i++) {
				itemsOrdered[QtyOrdered] = dvdlist[k];
				k++;
			}
		}
	}
	public void removeDigitalVideoDisk(DigitalVideoDisk disc) {
		int i;
		int k;
		DigitalVideoDisk itemsOrdered[] = new DigitalVideoDisk[MAX_ORDERED];
		for(i = 0 , k = 0; i < QtyOrdered ; i++) {
			if(this.itemsOrdered[i] == disc) {
				System.out.println("Removed Successfully!");
				continue;
			}
			itemsOrdered[k++] = this.itemsOrdered[i];
		}
		this.itemsOrdered = itemsOrdered;
		QtyOrdered--;
	}
	public void totalCost() {
		int i;
		float sum = 0;
		for(i = 0; i < QtyOrdered ; i++) {
			sum += this.itemsOrdered[i].getCost();
		}
		System.out.printf("\nTotal Cost: %f",sum);
	}
	public void OutPut() {
		System.out.printf("\n***************ORDER**************************************************");
		dateOrdered.OutPut();
		System.out.printf("\nOrdered Items: ");
		for(int i = 0 ; i < QtyOrdered ; i++) {
			System.out.printf("\n %d.DVD - [%s] - [%s] - [%s] - [%s]:[%s]",i+1,itemsOrdered[i].getTitle(),itemsOrdered[i].getCategory(),itemsOrdered[i].getDirector(),itemsOrdered[i].getLength(),itemsOrdered[i].getCost());
		}
		totalCost();
		System.out.printf("\n**********************************************************************");
		
	}
}
