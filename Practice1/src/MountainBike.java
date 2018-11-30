
public class MountainBike extends Bicycle{

	private int seatHeight;
	
	
	public MountainBike(int startSpeed, int startGear, int seatHeight) {
		super(startSpeed, startGear);
		this.seatHeight = seatHeight;
	}
	
	public void WriteOut() 
    {
    	System.out.println("Bicycle is at seatHeight"+seatHeight);
    	super.WriteOut();
    }

	/**
	 * @return the seatHeight
	 */
	public int getSeatHeight() {
		return seatHeight;
	}

	/**
	 * @param seatHeight the seatHeight to set
	 */
	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}
	
	
}
