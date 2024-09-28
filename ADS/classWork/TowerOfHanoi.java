package CW.demo;



public class TowerOfHanoi {
	
	public static void toh(int n,char s , char a, char d){
		if (n==1) {
			System.out.println("Disk from "+ s + " to " +d);
			return;
		}
			
		toh(n-1,s,d,a);
		System.out.println("Disk from "+ s + " to " +d);
		toh(n-1,a,s,d);
	}
	
	public static void main(String[] args) {
		toh(3,'a','b','c');
	}
}
