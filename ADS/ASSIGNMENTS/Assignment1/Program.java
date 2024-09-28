package ans.assignment1;



/// 3 .Problem: Write a Java program to compute the factorial of a given number.
//
//Test Cases:
//
//Input: 5
//Output: 120
//Input: 0
//Output: 1


public class Program {
	
	public static boolean armstrong(int a) {
		int num=a;
		 int sum=0;
		 int power=String.valueOf(a).length();
		 while(a>0) {
			 int d=a%10;
			 a=a/10;
			 
			 sum=(int) (sum+Math.pow(d,power));
		 }
		 	return num==sum;
		
	}
	
	public static int factorial1(int a) {
		 int res = 1;
		if(a==0 || a==1)
			return res;
		
		while(a>1) {
			 res=res*a;
			 a--;
		}
		return res;
	}
	
	public static boolean prime(int a) {
		if(a<1)
			return false;
		if (a==2)
			return true;
		for(int i=2;i<a;i++) {
			if( a%i==0) {
				return false;
			}
				
		}	
		return true;
	}
	
	 
	public static int factorial(int a) {  //
		
		if(a==0 || a==1)
			return 1;
			
		return a=a*factorial(a-1);   //recursion
		
	}
	
	public static void Fibonacci(int n ) {
		int a=0;
		int b=1;
		int c;
		
		for(int i=0;i<n;i++) {
			System.out.print(a + " ");
			c=a+b;
			a=b;
			b=c;		
		}
		
	}
	public static int gcd(int a,int b) {
		if(a==0)
			return b;
		if(b==0)
			return a;
		if(a>b)
			return gcd(a%b,b);
		if(a<b) 
			return gcd (a,b%a);
 		return -1;			
	}
	
	public static int pal(int num,int rev) {
		//int temp=num;
		if (num==0 ) {
			return rev ;
		}
			
		
			
			
		int rm=num%10;
		rev=rev*10+rm;
		num=num/10;
		return pal(num,rev);
	
	}
	
	
	public static void main(String[] args) {
		
		
//
//		int num=122;
//		//System.out.println(pal(num,0));
//		if(num==pal(num,0)) {
//			System.out.println("true");
//		}
//		else 
//			System.out.println("false");
		
//		System.out.println(gcd(54,24));  //6
//		System.out.println(gcd(17,13));  //1
		
//		Fibonacci(5);

//		int b=4;
//		System.out.println(factorial(b));
//		System.out.println(factorial1(b));
		
//		System.out.println(prime(6));
//		System.out.println(prime(3));
		
//		System.out.println(armstrong(153));  //true
//		System.out.println(armstrong(123));  //false
		
		


		
	}

}
