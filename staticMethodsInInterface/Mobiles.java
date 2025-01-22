package staticMethodsInInterface;

interface MobileInterface{
	void displayType();
	void vedioCall();
	void camera();
	static void games() {
		System.out.println("We can play games");
	}
	static void voiceCall() {
		System.out.println("We can do voice call");
	}
}

class SamsungS25 implements MobileInterface{

	@Override
	public void displayType() {
		System.out.println("ScreenTouch Mobile");
	}

	@Override
	public void vedioCall() {
		System.out.println("We can do video call");
	}

	@Override
	public void camera() {
		System.out.println("High resolution camera");
	}
}

class SamsungK12 implements MobileInterface{

	@Override
	public void displayType() {
		System.out.println("Keypad Mobile");
	}

	@Override
	public void vedioCall() {
		System.out.println("We can't do video call");
	}

	@Override
	public void camera() {
		System.out.println("Low resolution camera");
	}
}


public class Mobiles {
	public static void main(String[] args) {
		SamsungS25 s25=new SamsungS25();
		System.out.println("SamsungS25 :");
		s25.camera();
		s25.displayType();
		MobileInterface.games();
		MobileInterface.voiceCall();
		s25.vedioCall();
		
		System.out.println("=====================================");
		
		SamsungK12 k12=new SamsungK12();
		System.out.println("SamsungK12 :");
		k12.camera();
		k12.displayType();
		MobileInterface.games();
		MobileInterface.voiceCall();
		k12.vedioCall();
	}

}
