/*Author 
 * Name:SarikaGummapu
 * ID:99999-4000
 * Project decription:Project to find area of geometric shape.
 */

//Circle class definition
public class Circle implements Shape
{

	//private member of class
	private double radius;
	
	//parameterized constructor 
	public Circle(double r)
	{
		radius = r;
	}
	//Returns the radius 
	public double getRadius()
	{
		return radius;
	}
	//Assign the new radius 
	public void setRadius(double newR)
	{
		radius = newR;
	}

	//Returns the area of the circle
	public double area()
	{
		return radius * radius * Math.PI;
	}
}

