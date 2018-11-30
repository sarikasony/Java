/*Author Details:
 * Name:Sarika
 * ID:99999-4000
 */
/*Project Description: classes for  figures: rectangles, triangles are created where the graphic sustem prints rectangle and triangle 
 * using special character '*' forming a shape of house*/
public class Driver{
	public  static void main(String[] args){
		System.out.println("Welcome to my house:");
		Triangle t1 = new Triangle(6);
		t1.draw();
		System.out.println("=============");
		Rectangle r1 = new Rectangle(11, 4);
		r1.draw();
	}

}