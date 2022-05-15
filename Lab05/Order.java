package hust.soict.hedspi.aims.order.Order;
import java.text.SimpleDateFormat;
import java.util.Date;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Order {
    
	public static final int MAX_NUMBER_ORDERED = 10;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	Date dateOrdered = new Date();
    public static final int MAX_LIMITTED_ORDERS = 5;
    private int nbOrders = 0;
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	
	private static int quantity = 0;
	public int qtyOrdered() {
		return quantity;
	}
	public int eachQtyOrdered() {
		return nbOrders;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(quantity <= MAX_NUMBER_ORDERED) {
		  if(nbOrders < MAX_LIMITTED_ORDERS) {
		     itemsOrdered[nbOrders] = disc;
		     nbOrders++;
		     quantity++;
             System.out.println("The disc " + disc.getTitle() + " has been added");
		  }
		  else {
			 System.out.println("You can only make " + MAX_LIMITTED_ORDERS + " orders!");
		  }

		}
		else {
			System.out.println("The number ordered is limited!");
		}
		
	}
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
	    for(int i = 0; i < dvdList.length; i++) {
	        addDigitalVideoDisc(dvdList[i]);
	    }
	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
	   addDigitalVideoDisc(dvd1);
	   addDigitalVideoDisc(dvd2);
	    
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int pos = 0;
		for(int i = 0; i < quantity; i++) {
			if(itemsOrdered[i] == disc) {
				pos = i;
			}
		}
		for(int j = pos; j < quantity; j++) {
			itemsOrdered[j] = itemsOrdered[j + 1];
		}
		--quantity;
		--nbOrders;
		System.out.println("The disc " + disc.getTitle() + " has been removed!");
	}
	public float totalCost() {
		float total = 0;
		
		for(int i = 0; i < nbOrders; i++) {
			   total += itemsOrdered[i].getCost();
			
		}
		return total;
	}
	public void printDate() {
		System.out.println("The date you made the order is: " + formatter.format(dateOrdered));
	}
    public void printList() {
    	System.out.println("*********************Order************************");
    	System.out.println("Date: " + formatter.format(dateOrdered));
    	System.out.println("Ordered Items: ");
    	for(int i = 0; i < eachQtyOrdered(); i++) {
    		System.out.print((i + 1) + ". DVD ");
    		if(itemsOrdered[i].getTitle() != null) {
    			System.out.print("- " + itemsOrdered[i].getTitle());
    		}
    		if(itemsOrdered[i].getCategory() != null) {
    			System.out.print(" - " + itemsOrdered[i].getCategory());
    		}
    		if(itemsOrdered[i].getDirector() != null) {
    			System.out.print(" - " + itemsOrdered[i].getDirector());
    		}
    		if(itemsOrdered[i].getLength() != 0) {
    			System.out.print(" - " + itemsOrdered[i].getLength());
    		}
    		if(itemsOrdered[i].getCost() != 0) {
    			System.out.print(": " + itemsOrdered[i].getCost());
    		}
    		System.out.println();
    	}
    	System.out.println("You got a lucky item! Your ticket of movie " + getALuckyItem().getTitle() + " will be free!");
    	System.out.println("Total cost: " + (totalCost() - getALuckyItem().getCost()));	
    	System.out.println("**************************************************");	
    }
    DigitalVideoDisc getALuckyItem() {
    	int min = 1;
    	int max = eachQtyOrdered();
    	int rand = (int)Math.floor(Math.random()*(max - min + 1) + min);
        return itemsOrdered[rand - 1];
    }
    public void printLucky() {
    	System.out.println(getALuckyItem().getTitle());
    }
    
		
}
