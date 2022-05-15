package hust.soict.hedspi.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class NoGarbage {
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
   	StringBuilder str = new StringBuilder();
   	for(byte b : input) {
   		str.append(b);
   	}
   	long end = System.currentTimeMillis();
   	System.out.println(end - start);
   }
}
