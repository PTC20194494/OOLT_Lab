package traffic;

import java.util.ArrayList;

public class Segment {
	
	Junction junction1 = new Junction();
	Junction junction2 = new Junction();
	ArrayList<Lane> lane = new ArrayList<>();
	
	public ArrayList<RoadCompartment> Block(long tS,long tE) {
		int i,j,k;
		ArrayList<RoadCompartment> list = new ArrayList<>();
		for(i = 0; i< lane.size();i++) {
			if(lane.get(i).tE <= tE && lane.get(i).tS >= tS) {
				for(j = 0; j < lane.get(i).alley.size();j++) {
					list.add(lane.get(i).alley.get(j));
				}
				for(k = 0; k < lane.get(i).bridge.size();k++) {
					list.add(lane.get(i).bridge.get(k));
				}
				
			}
		}
		return list;
	}

}
