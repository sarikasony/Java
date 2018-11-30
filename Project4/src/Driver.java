/*Author Details:
 * Name:Sarika
 * ID:99999-4000
 */
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cashPayment cp1=new cashPayment(200.0);
		cashPayment cp2=new cashPayment(111.26);
		creditPayment crp1=new creditPayment("Irene","22/11/2022",13467,456.32);
		creditPayment crp2=new creditPayment("Cathy","11/02/2012",34567,987.23);
		cp1.paymentDetails();
		cp2.paymentDetails();
		crp1.paymentDetails();
		crp2.paymentDetails();
		}

	}

