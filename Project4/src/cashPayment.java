/*Author Details:
 * Name:Sarika
 * ID:99999-4000
 */
public class cashPayment extends Payment
{
//Payment amount
private double amount;
/**
* Constructor to initialize payment amount
*/
public cashPayment(double paymentAmount)
{
amount=paymentAmount;
}
public void paymentDetails() //Displays amount payment in cash
{
System.out.println("The amount is paid in cash. Amount paid "+amount);
}
}
