package CW.queue;

public class CircularQ {
	int size=5;
	int Q[]=new int[5];
	int f,r;
	CircularQ(){
		f=-1;
		r=-1;
	}
	
	boolean isEmpty() {
		return(f==-1);
	}
	
	boolean isFull() {
		return ((r+1)%size == f);
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
