package CW.queue;

public class SimpleQueue {
	int size=5;
	int Q[]=new int[5];
	int f,r;
	SimpleQueue(){
		f=-1;
		r=-1;
	}
	
	boolean isEmpty() {
		return(f==-1);
	}
	
	boolean isFull() {
		return (r==size-1);
	}
	
	void enqueue(int val){
		if(isFull()) 
			System.out.println("Q is full");
		else {
			if(f==-1)
				f=0;
			r++;
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
			if(f>r) {
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
			for(int i=f;i<=r;i++) {
				System.out.print(Q[i]+ " ");
			}
		}
		System.out.println();
		System.out.println();
	}
	public static void main(String[] args) {
		SimpleQueue q1=new SimpleQueue();
		q1.enqueue(11);
		q1.enqueue(12);
		q1.enqueue(13);
		q1.enqueue(14);
		q1.display();
		
		q1.dequeue();
		q1.display();
		
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.display();
		
		
		
	}

}
