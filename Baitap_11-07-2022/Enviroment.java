package traffic;

import java.util.ArrayList;

public class Enviroment {
	ArrayList<Segment> segmentlist;
	public Enviroment() {
		segmentlist = new ArrayList<>();
	}
	public void Clear(long tS,long tE) {
		ArrayList<RoadCompartment> result = new ArrayList<>();
		result = segmentlist.get(0).Block(tS, tE);
		for(int i = 0; i < result.size(); i++) {
			if(result.get(i).type == "road") {
				System.out.println("clean alley " + result.get(i).id);
			}else {
				System.out.println("clean bridge " + result.get(i).id);
			}	
		}
	}

}
