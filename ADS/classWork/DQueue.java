package CW.queue;

public class DQueue {
	int size=5;
	int Q[]=new int[5];
	int f,r;
	DQueue(){
		f=-1;
		r=0;
	}
	
	boolean isEmpty() {
		return(f==-1);
	}
	
	boolean isFull() {
		return ((f==0&&r==size-1)|| f==r+1);
	}
	void insertFront(int key) {
		if(isFull()) {
			System.out.println("q is full");
		}
		if(f==-1) {
			f=0;
			r=0;
		}
		else if(f==0)
			f=size-1;
		else
			f=f-1;
		Q[f]=key;
	}
	
	void insertRear(int key) {
		if (isFull()) {
			System.out.println("full");
			return;
		}
		if(f==-1) {
			f=0;
			r=0;
		}
		else if(r==size-1)
			r=0;
		else
			r=r+1;
		Q[r]=key;
	}
	void deletFront() {
		if(isEmpty()) {
			System.out.println("empty");
			return;
		}
		if(f==r) {
			f=-1;
			r=-1;
		}
		else if(f==size-1)
			f=0;
		else
			f=f+1;
		
	}
	void deletRear() {
		if(isEmpty()) {
			System.out.println("empty");
			return;
		}
		if(f==r) {
			f=-1;
			r=-1;
		}
		else if(r==0)
			r=size-1;
		else
			r=r+1;
		
	}
	int getFront() {
		if(isEmpty()) {
			System.out.println("empty");
			return -1;
		}
		return Q[f];
	}
	int getRear() {
		if(isEmpty() || r<0) {
			System.out.println("empty");
			return -1;
		}
		return Q[r];
	}
	
	
	void enqueue(int val){
		if(isFull()) 
			System.out.println("Q is full");
		else {
			if(f==-1)
				f=0;
			r=(r+1)%size;
			Q[r]=val;
			System.out.println(val + " added");
		}
	}
	int dequeue() {
		if(isEmpty()) {
			System.out.println("Q is empty");
			return -1;
		}
		else {
			int x=Q[f];
			System.out.println(x+" deleted");
			if(f==r) {
				f=-1;
				r=-1;
			}
			else {
				f++;
			}
			return x;
		}
		
	}
	void display() {
		if(isEmpty()) {
			System.out.println("empty");
		}
		else {
			System.out.println("Ques ele:");
			int i=f;
			while(i!=r) {
				System.out.println(Q[i]);
				i=(i+1)%size;
			}
		}
		System.out.println();
		System.out.println();
	}
	public static void main(String[] args) {
		CircularQ q=new CircularQ();
	
		q.enqueue(11);
		q.display();
		q.enqueue(12);
		q.enqueue(13);
		q.enqueue(14);
		q.display();
	}



}
