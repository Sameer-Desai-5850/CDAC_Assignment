package CW.demo;

	// 0,1,1,2,3,5,8,13,21....
public class Fibonacii {
	
	public static int fib(int n) {
		if(n<=1)
			return n;
		return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) {
		int num=10;
		for (int i=0;i<num;i++){
			System.out.print(fib(i)+" ");
		}
		
	}

}


