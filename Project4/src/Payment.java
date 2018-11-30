/*Author Details:
 * Name:Sarika
 * ID:99999-4000
 */
public class Payment {
	//Payment amount
	private double amount;
	//Constructor to initialize amount to 0
	public Payment()
	{
	amount = 0.0;
	}
	/**
	* Constructor to initialize payment amount
	*/
	public Payment(double paymentAmount)
	{
	amount=paymentAmount;
	}
	public void paymentDetails()
	{
	System.out.println("The amount paid is "+amount);
	}


}
