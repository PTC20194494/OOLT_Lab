package hust.soict.hedspi.aims.Aims;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order.Order;

public class DiskTest {
   public static void main(String[] args) {
	   DigitalVideoDisc d1 = new DigitalVideoDisc("Doctor Strange 2", "Sci-fi", "Sam Raimi", 120, 15f);
	   DigitalVideoDisc d2 = new DigitalVideoDisc("Khách sạn huyền bí: Ma cà rồng biến hình" , 31.2f);
	   DigitalVideoDisc d3 = new DigitalVideoDisc("Liên Minh Công Lý" , "Sci-fi", "Zack Snyder", 180, 12.5f);
	   Order test = new Order();
	   test.addDigitalVideoDisc(d1);
	   test.addDigitalVideoDisc(d2);
	   test.addDigitalVideoDisc(d3);
	   test.printList();
	   System.out.println(d1.search("Doctor"));
   }
}
