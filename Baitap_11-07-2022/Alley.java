package traffic;

public class Alley extends RoadCompartment{
	
	
    public Alley(int id, float w,float l) {
    	this.id = id;
    	this.width = w;
    	this.lenght = l;
    	this.type = "road";
    	vMax = getVmax(w,l);
    	//vMax = calculateVmax(w,l);
    }
    private float getVmax(float w, float l) {
		vMax = (float) Math.sqrt(w*l/5);
		return vMax;
	}


	private float calculateVmax(float w, float l) {
		float wScale = w/Vehicle.w;
		if(wScale >= 1) {
			if(wScale < 2) {
				vMax = 20;
			}else if(wScale >= 2 || wScale < 4) {
				vMax = 40;
			}else {
				vMax = 60;
			}
			if( l > 0 && l <= 100) {
				vMax -= l/12;
			}
			if( l > 100 && l <= 500) {
				vMax -= l/20;
			}
			if( l > 500) {
			//nothing happen
				}
			}else {
				if(w*l < 0.52) {
					this.vMax = 0;
				}
			}
		return vMax;
	}

}
