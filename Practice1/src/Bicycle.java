
public class Bicycle {
	
    private int gear;
    private int speed;
        
    public Bicycle(int startSpeed, int startGear) {
        gear = startGear;
        speed = startSpeed;
    }
    
    
        
    public int getGear() {
        return gear;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public int getSpeed() {
        return speed;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
    
    public void WriteOut() 
    {
    	System.out.println("Bicycle is moving at speed"+speed);
    	System.out.println("Bicycle is moving at gear"+gear);
    }
}
