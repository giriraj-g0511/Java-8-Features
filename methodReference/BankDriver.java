package methodReference;

interface Bank{
	void message();
}

class MessageCollections{
	
	public static void welcomeMessage() {
		System.out.println("Welcome to OUR Bank family\nYour welcome kit will be delivered in 15 working days.\nOn delivery day you will be notified.");
	}
	
	public static void birthdayMessage() {
		System.out.println("Happy Birthday\nWe wish you for having more balance in your bank account :)\nEnjoy your day...");
	}
	
	public static void kitDeliverdMessage() {
		System.out.println("Hey, You will receive your welcome kit today,");
		System.out.println("Please collect that by only you for identification.");
	}
	
	public static void bankServerOffForServicing(){
		System.out.println("Today bank server will be off for servicing puerpose so the upi transactions are unavailable for today.");
		System.out.println("We apologzise for your inconviniencecy.");
	}
	
}

public class BankDriver {
	
	//It cosist list of customers for those we have to use static method reference to send these messages

}
