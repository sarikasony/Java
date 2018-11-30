/*Author Details:
 * Name:Sarika
 * ID:99999-4000
 */
/*Project Description: classes for  figures: rectangles, triangles are created where the graphic sustem prints rectangle and triangle 
 * using special character '*' forming a shape of house*/
public class Rectangle extends Figure{
	private int width;
	private int height;
	
	public Rectangle(){
		this.width=0;
		this.height=0;
	} 
	
	public Rectangle(int width,int height){
		this.width=width;
		this.height=height;
	} 
	public Rectangle (Rectangle other) {
		this (other.width, other.height);
	}
	
	public void draw(){
		// outer loop to handle number of rows
		for(int i=1;i<=this.height;i++){
			System.out.print(" ");
			//  inner loop to handle number of columns
            for(int j=1;j<=this.width;j++){
                System.out.print("*");
            }
            System.out.println();
        }
	}
	
}