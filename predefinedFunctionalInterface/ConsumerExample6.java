package predefinedFunctionalInterface;

import java.util.function.Consumer;

class ConsumerExample6 {

	public static String welcomeMessage() {
		return "Welcome to OUR Bank family\nYour welcome kit will be delivered in 15 working days.\nOn delivery day you will be notified.";
	}
	
	public static String birthdayMessage() {
		return "Happy Birthday\nWe wish you for having more balance in your bank account :)\nEnjoy your day...";
	}
	
	public static String kitDeliverdMessage() {
		return "Hey, You will receive your welcome kit today,\nPlease collect that by only you for identification.";
	}
	
	public static String bankServerOffForServicing(){
		return "Today bank server will be off for servicing puerpose so the upi transactions are unavailable for today.\nWe apologzise for your inconviniencecy.";
	}
	
	public static void main(String[] args) {
		Consumer<String> consumer=message->System.out.println(message);
		
		consumer.accept(birthdayMessage());
		
	}

}
