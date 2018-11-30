//Odometer class definition

//Odometer.java
public class Odometer
{
   //instace variables
   private int mileage;
   private int miles;
  

   //set contructor miles to zero
   //and initial mileage to 20 mph(miles per hour)
   public Odometer()
   {
       miles=0;
       //set initializ mileage to 20
       mileage=20;
   }

   //reset miles to zero
   public void reset()
   {      
       miles=0;
      
   }  
   //returns mileage
   public int getMileage()
   {
       return mileage;
   }
   //returns miles
   public int getMiles()
   {
       return miles;
   }
  
      
   //Override the equals method that returns true
   //if the Object is miles and mileage are equal
   //to class miles and mileage
   @Override
   public boolean equals(Object obj)
   {
       //Cast to odometer class
       Odometer other=(Odometer)obj;
      
       //check if the miles,mileage and gallons
       //are equal of object of Odometer
       if(this.miles==other.getMiles() &&
               this.mileage==other.getMileage())
               return true;
           else
               return false;
      
   }
  

   //Returns the string represenation of Odometer
   @Override
   public String toString() {      
       return "Miles : "+getMiles()
               +"\nMileage : "+getMileage();
   }

   //add miles
   public void milesDriven(int miles)
   {
       this.miles+=miles;
      
   }

   //Set mileage (fuel efficiency)
   public void setFuelEfficiency(int mileage)
   {
       this.mileage=mileage;      
   }

   //returns gas used
   public int getGasUsed()
   {
      
       return miles/mileage;
   }
}

