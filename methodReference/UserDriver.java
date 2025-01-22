package methodReference;

interface User{
	void notifyUser();
}

public class UserDriver {
	public static void  orderDeliveryNotification() {
		System.out.println("Your order is out for Delivery");
		System.out.println("above statement from orderDeliveryNotifiation method");
	}
	
	public static void main(String[] args) {
		

		System.out.println("Implementation using lambda expression");
		//By lambda expression
		User u=()->System.out.println("Your parcel is out for delivery");
		u.notifyUser();
		System.out.println(u);

		System.out.println();
		System.out.println();
		
		System.out.println("Implementation using double colon operator(ClassName::methodName)");
		//By double colon operator
		User us=UserDriver::orderDeliveryNotification;
		us.notifyUser();
		System.out.println(us);
		
		System.out.println();
		System.out.println();
		
		System.out.println("Calling method directly using dot operator(ClassName.methodSignature)");
		//Direct call to method
		UserDriver.orderDeliveryNotification();
		System.out.println(UserDriver.class);		
		
	}
	
}
