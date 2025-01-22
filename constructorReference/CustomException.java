package constructorReference;

class MyException extends Exception{
	public MyException(String message) {
		super(message);
	}
}

interface CustomExceptions{
	MyException createMyException(String message);
}

class CustomException {
	public static void main(String[] args) {
		CustomExceptions c=MyException::new;
		try {
			throw c.createMyException("This is my Custome Exception");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
