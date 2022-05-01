package main;

import java.util.Calendar;
import java.util.Scanner;

public class MyDate {
	Calendar calendar = Calendar.getInstance();
	int day;
	int month;
	int year;

	public MyDate() {
		this.day = calendar.get(Calendar.DAY_OF_MONTH);
		this.year = calendar.get(Calendar.YEAR);
		this.month = calendar.get(Calendar.MONTH);		
	}
	public MyDate(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	void accept() {
		Scanner sc= new Scanner(System.in); 
		System.out.println("\nEnter a date(Format: dd mm yyyy): ");  
		String date= sc.nextLine();
		String[] adate = date.split(" ");
		this.day = Integer.parseInt(adate[0]);
		this.month = Integer.parseInt(adate[1]);
		this.year = Integer.parseInt(adate[2]);
	}
	public MyDate(String date) {
		String[] adate = date.split(" ");
		this.day = Integer.parseInt(adate[0]);
		this.month = Integer.parseInt(adate[1]);
		this.year = Integer.parseInt(adate[2]);
	}
	public MyDate(String day,String month,String year) {
		this.day = Integer.parseInt(day);
		this.month = Integer.parseInt(month);
		this.year = Integer.parseInt(year);
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void OutPut() {
		System.out.printf("\nDate: %d - %d - %d",day,month,year);
	}

}
