package CW.demo;
////incomplete
//class Stack{
//	static final int MAX=5;
//	int top;
//	int a[]=new int[MAX];
//	public Stack() {
//		// TODO Auto-generated constructor stub
//		top=-1;
//	} 
//	
//	boolean isEmpty() {
//		return (top<0);
//	}
//	
//	boolean push(int val){
//		if(top>=(MAX-1)) {
//			System.out.println("Stack overflow");
//			return false;
//		}
//		a[++top]=val;
//		return true;		
//	}
//	int pop(){
//		if(top<0) {
//			System.out.println("stack underflow");
//			return 0;
//		}
//		return a[top--];
//	}
//	int peek() {
//		return (top<0)?0:a[top];
//	}
//	void display() {
//	
//		for(int i=top;i>=0;i--) {
//			System.out.println(a[i]);
//		}
//		
//	}
//	void disp() {
//		if(top<0) {
//			System.out.println("stack emplty");
//		}
//		else {
//			 System.out.println("element");
//			 show(top);
//		
//		}
//	}
//	void show(int index) {
//		if(index<0) return;
//		System.out.println(a[index]);
//		show(index-1);
//	}
//}
//public class ReverseString {
//	
//	public static void main(String[] args) {
//		
//		Stack s=new Stack();
//		
//		String str="SAMEER";
//	}
//}
