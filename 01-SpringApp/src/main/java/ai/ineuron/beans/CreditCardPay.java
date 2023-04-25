package ai.ineuron.beans;

public class CreditCardPay implements IPay {

	 public CreditCardPay( ) {
	     System.out.println("Credit Card object is created by IOC");
	   }

	public boolean payBill(Double amt) {
		  System.out.println("Paying bill through credit card");
	      return true;

	   }

}
