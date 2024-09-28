package CW.demo;
import java.util.*;


public class Array {
	
	static int insert(int arr[], int size,int key,int capacity) {
		if(size>capacity) {
			System.out.println("full");
			return size;
		}
		arr[size]=key;
		return size+1;
		
	}
	static  int search(int arr[], int size,int key,int capacity){
		for(int i=0;i<size;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	static  int delete(int arr[], int size,int key,int capacity){
		int pos=search(arr,size,key,100);
		if(pos==-1) {
			System.out.println("not found");
			return size;
		}
		for(int i=pos;i<size;i++) {
			arr[i]=arr[i+1];
		}
		return size-1;
		
	}
	public static void main(String[] args) {
		int a1[]=new int[100];
		
		int size=10;
		Scanner s= new Scanner(System.in);
//		a1[0]=11;
//		a1[1]=13;
//		a1[2]=15;
//		a1[3]=51;
//		a1[4]=71;
//		
//		a1[5]=56;
//		a1[6]=48;
//		a1[7]=8;
//		a1[8]=99;
		a1[9]=110;
		for(int i=0;i<10;i++) {
			System.out.println("Enter element"+i+"=");
			a1[i]=s.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			System.out.print(a1[i]+" ");
		}
		int key=48;
		int pos =search(a1,size,key,100);
		if (pos!=1)
			System.out.println("fount");
		else 
			System.out.println("not fount");
		//insert
		insert(a1,size,key,100);
		
	}
}
