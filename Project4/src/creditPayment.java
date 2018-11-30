/*Author Details:
 * Name:Sarika
 * ID:99999-4000
 */
public class creditPayment extends Payment
{
//Payment amount
private double amount;
//data member to stores name on the card, expiration date and card number.
private String name,exdate;
private long cardnumber;
/*
* Constructor to initialize the card with its details and amount paid.
*/
public creditPayment(String nm,String expdate,long no,double paymentAmount)
{
name=nm;
exdate=expdate;
cardnumber=no;
amount = paymentAmount;
}
public void paymentDetails() //Displays amount payment in credit and card details
{
System.out.println("The amount is paid using credit card. Amount paid "+amount);
System .out.println("Card Details:");
System.out.println("Name: "+name+"\nExpiration Date:"+exdate+"\nCard Number:"+cardnumber);
}
}
