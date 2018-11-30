//Test program that tests the odometer class
//and prints the results of each object
//OdometerDriver.java
public class Driver
{
    public static void main( String[] args )
    {
       // instantiate an vehicle odometer
        Odometer oldCar = new Odometer( );         

        //add miles to the oldCar object
        oldCar.milesDriven( 50 );                       
        oldCar.milesDriven( 130 );
        oldCar.milesDriven( 40 );
        oldCar.milesDriven( 200 );
        oldCar.milesDriven( 300 );

        System.out.println("Odometer Reading");
        System.out.println(oldCar.toString());
        System.out.println( "The amount of gas used at 20 mph is " +
                            oldCar.getGasUsed( ) );

        Odometer newCar = new Odometer( );   // instantiate an new car's odometer      
      
        //set fuelefficiency
        newCar.setFuelEfficiency( 35 );

      //add miles to the oldCar object
        newCar.milesDriven( 50 );            // drive the new car four times           
        newCar.milesDriven( 130 );
        newCar.milesDriven( 40 );
        newCar.milesDriven( 200 );
        newCar.milesDriven( 300 );

        System.out.println("Odometer Reading");
        System.out.println(newCar.toString());
        System.out.println( "The amount of gas used at 35 mph is " +
                            newCar.getGasUsed( ) );

        //Call reset metod to reset the number of miles driven by new car
        newCar.reset();                   
        // reset the new car's odometer to 40mi/l
        newCar.setFuelEfficiency( 40 );
      
     // add miles to the new car
        newCar.milesDriven( 30 );                        
        newCar.milesDriven( 200 );
        newCar.milesDriven( 80 );
        newCar.milesDriven( 35 );
        newCar.milesDriven( 60 );
        newCar.milesDriven( 500 );

        System.out.println("Odometer Reading");
        System.out.println(newCar.toString());
        System.out.println( "The amount of gas used at 40 mph is " +
                            newCar.getGasUsed( ) );
      
      
        if(oldCar.equals(newCar))
           System.out.println("oldCar miles and mileage equals newCar miles and mileage ");
        else
           System.out.println("oldCar miles and mileage not equals newCar miles and mileage ");
      
        

    }
}