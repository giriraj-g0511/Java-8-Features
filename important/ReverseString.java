package important;

class ReverseString {
	public static void main(String[] args) {
		String s="Hello World welcome";
		String se="";
		String n="";
		boolean flag=true;
		for (int i = s.length()-1;i>=0 ; i--) {
			if (s.charAt(i)!=' ') {
				se=s.charAt(i)+se;
			} else if(flag==true) {
				flag=false;
				n=se;
				se="";
			} else {
				n=n+" "+se;
				se="";
			}
			
			if(i==0) {
				n=n+" "+se;
			}
		}
		System.out.println(n);
		
		
		/*Using String builder, String buffer and String*/
		//Hello = olleH
		
		String sq=new StringBuilder("Hello").reverse().toString();
		System.out.println(sq);
	}
}
