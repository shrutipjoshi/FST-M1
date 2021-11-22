package Activity;
//Derived class
class MountainBike extends Bicycle {
    
	//The MountainBike subclass adds one more field
	    public int seatHeight;

	    //The MountainBike subclass has one constructor
	    public MountainBike(int gears, int currentSpeed, int startHeight) {
	        //Invoking base-class(Bicycle) constructor
	        super(gears, currentSpeed);
	        seatHeight = startHeight;
	    }
}
