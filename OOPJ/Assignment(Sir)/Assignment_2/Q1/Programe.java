package Assignment2.Q1;

public class Programe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//b
		boolean status=true;
		String str=Boolean.toString(status);
		System.out.println(str);  // true
		
		//c
		
		String strStatus="true";
		boolean b=Boolean.parseBoolean(strStatus);
		System.out.println(b); //true
		
		//d
		String strStatus1="1";  //outpu true 
		boolean b1=Boolean.parseBoolean(strStatus1);  //outpu true only for "true" other value o/p false
		System.out.println(b1); //false
		
		//e
		
		boolean status1=true;
		boolean b2=Boolean.valueOf(status1);
		System.out.println(b2);    //true
		
		//f
		String strStatus2="true";
		//boolean b3= Boolean.valueOf(strStatus2);
		System.out.println(Boolean.valueOf(strStatus2));    //true
		
		//g
		//converting boolean type to other primitive type like int float double is not possible give compile time error
		boolean val=true;
		//int intval=(int) val;  give comp time error
		//float floatval=(flaot) val;   ---->comp. time err.
		

		

		
		

	}

}
