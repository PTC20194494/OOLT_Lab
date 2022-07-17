package traffic;

import java.util.ArrayList;

public class Lane {
	
	int width;
	int lenght;
	int vMax;
	long tS;
	long tE;
	String name;
	public ArrayList<Alley> alley = new ArrayList<>();
	public ArrayList<Bridge> bridge = new ArrayList<>();
	
	public Lane(float vMax) {
		vMax = 50;
		tS = System.currentTimeMillis() / 1000L;
		double time = ((Math.random() * (43200 - 1800)) + 1800);
		tE = (long) (tS+time); 
	}

}
