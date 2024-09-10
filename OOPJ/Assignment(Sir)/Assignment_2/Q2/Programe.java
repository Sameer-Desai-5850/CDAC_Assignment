package Assignment2.Q2;

public class Programe {

	public static void main(String[] args) {
		
		
		//b
		System.out.println(Byte.BYTES);  // o/p is 1 
		
		//c
		System.out.println("Byte.MIN_VALUE = "+Byte.MIN_VALUE );
		System.out.println("Byte.MAX_VALUE = "+Byte.MAX_VALUE );
		
		//d
		byte number=12;
		String str=Byte.toString(number);
		System.out.println(Byte.toString(number));
		
		//e
		String strNumber="32";
		System.out.println(Byte.parseByte(strNumber));
		
		//f
		String strNumber1="Ab12Cd3" ;
		//System.out.println(Byte.parseByte(strNumber1));  //Exception in thread "main" java.lang.NumberFormatException: For input string: "Ab12Cd3
		
		//g
		byte number1=45;
		System.out.println("Byte.valueOf(number1)== "+Byte.valueOf(number1) );
		
		//h
		String strNumber2="45";
		System.out.println(Byte.valueOf(strNumber2));
		
		//i
		byte num=5;
		short shortNum=(short)num;
		int inttNum=(int)num;
		float floatNum=(float)num;
		double doubleNum=(double)num;
		long longNum=(long)num;

		System.out.println("shortNum= "+shortNum);
		System.out.println("inttNum= "+inttNum);
		System.out.println("floatNum= "+floatNum);
		System.out.println("doubleNum= "+doubleNum);
		System.out.println("longNum= "+longNum);

	}

}
