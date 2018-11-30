/*Author 
 * Name:SarikaGummapu
 * ID:99999-4000
 * Project decription:Project to find area of geometric shape.
 */
//The rectangle class implements the Shape interface 
public class Rectangle implements Shape
{

	//declare the private members 
	private double length;
	private double width;
	
	//constructor to set length and width 
	public Rectangle(double l, double w)
	{
		length = l;
		width = w;
	}

	//Returns the length 
	public double getLength()
	{
		return length;
	}

	//Returns the width 
	public double getWidth()
	{
		return width;
	}

	//Assign the new value for length
	public void setLength(double newL)
	{
		length = newL;
	}
	//Assign the new value for width
	public void setWidth(double newW)
	{
		width = newW;
	}

	//returns the area of rectangle
	public double area()
	{
		return length * width;
	}
}