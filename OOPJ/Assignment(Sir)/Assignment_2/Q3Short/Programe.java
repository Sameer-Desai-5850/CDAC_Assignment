package Assignment2.Q3Short;

public class Programe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//b
		System.out.println(Short.BYTES);
		
		//c
		System.out.println("MIN_VALUE "+Short.MIN_VALUE);
		System.out.println("MAX_VALUE  "+Short.MAX_VALUE );
		
		//d
		short number=123;
		System.out.println(Short.toString(number));
		
		
		//e
		String strNumber="321";
		System.out.println(Short.parseShort(strNumber));
		
		//f
		String strNum="Ab12Cd3" ;
		//System.out.println(Short.parseShort(strNum)); //Exception in thread "main" java.lang.NumberFormatException: For input string: "Ab12Cd3"
		

		//g
		
		short num=456;
		System.out.println(Short.valueOf(num));
		
		//h
		String strNumber1="78";
		System.out.println(Short.valueOf(strNumber1));
		
		///i
		
		short a=10;
		byte b=(byte)a;  //explicite type cast   -->narrowing
		int i=a;
		float f=a;
		double d=a;
		long l=a;
		
		System.out.println("bytes = "+b);
	}

}
