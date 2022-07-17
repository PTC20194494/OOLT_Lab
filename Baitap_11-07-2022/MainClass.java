package traffic;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<RoadCompartment> result = new ArrayList<>();
		Enviroment enviroment = new Enviroment();
		Segment segment = new Segment();
		Lane lane1 = new Lane(25);
		
		 //half a day
		Lane lane2 = new Lane(50);
		
		Alley alley1 = new Alley(1,3,300);
		Alley alley2 = new Alley(2,4,400);
		Alley alley3 = new Alley(3,3,100);
		Alley alley4 = new Alley(4,6,400);
		Alley alley5 = new Alley(5,2,200);
		Bridge bridge = new Bridge(1);
		
		lane1.alley.add(alley1);
		lane1.alley.add(alley2);
		lane2.alley.add(alley3);
		lane2.alley.add(alley4);
		lane2.alley.add(alley5);
		lane1.bridge.add(bridge);
		segment.lane.add(lane1);
		segment.lane.add(lane2);
		
		enviroment.segmentlist.add(segment);
		
		long tS = System.currentTimeMillis() / 1000L-100;
		long tE = tS+43200; 
		result = segment.Block(tS, tE);
		
		System.out.println("Block alley/bridge: ");
		for(int i = 0; i < result.size(); i++) {
			if(result.get(i).type == "road") {
				System.out.println("alley " + result.get(i).id);
			}else {
				System.out.println("bridge " + result.get(i).id);
			}	
		}
		int sumV = 0;
		for(int i = 0; i < result.size(); i++) {
			sumV += result.get(i).vMax;
		}
		System.out.println("Velocity Summary: " + sumV + "km/h");
		
		enviroment.Clear(tS, tE);
		

	}

}
