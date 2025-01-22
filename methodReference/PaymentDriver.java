package methodReference;

interface Payment{
	void process(double amount);
}

class transaction{
	String name;

	public transaction(String name) {
		super();
		this.name = name;
	}
	public void paymentDone(double ammount) {
		System.out.println(ammount+" is send to "+name);
	}
}


public class PaymentDriver {

	public static void main(String[] args) {
		Payment pay=new transaction("USER")::paymentDone;
		pay.process(150);
	}
	
}
