/*Author Details:
 * Name:Sarika
 * ID:99999-4000
 */
/*Project Description: classes for  figures: rectangles, triangles are created where the graphic sustem prints rectangle and triangle 
 * using special character '*' forming a shape of house*/
public class Triangle extends Figure{
	private int height;
	
	public Triangle(){
		this.height=0;
	}
	
	public Triangle(int height){
		this.height=height;
	}
	
	public Triangle(Triangle other){
		this(other.height);
	}
	
	public void draw(){
		int n=this.height;
		// number of spaces
        int k = n;
  
        // outer loop to handle number of rows
        for (int i=0; i<n; i++)
        {
 
            // inner loop to handle number spaces
            for (int j=0; j<k; j++)
            {
                // printing spaces
                System.out.print(" ");
            }
  
            // decrementing k after each loop
            k = k - 1;
  
            //  inner loop to handle number of columns
            for (int j=0; j<=i; j++ )
            {
                // printing stars
                System.out.print("* ");
            }
  
            // ending line after each row
            System.out.println();
        }
	}
}