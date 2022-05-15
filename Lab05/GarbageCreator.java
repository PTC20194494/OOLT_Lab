package hust.soict.hedspi.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
    	String file = "D:\\OOP\\test.txt";
    	byte[] input = { 0 };
    	try {
    		input = Files.readAllBytes(Paths.get(file));
    	}
    	catch(IOException e) {
    		e.printStackTrace();
    	}
    	long start = System.currentTimeMillis();
    	String str = "";
    	for(byte b : input) {
    		str += b;
    	}
    	long end = System.currentTimeMillis();
    	System.out.println(end - start);
    	
    }
    
}
