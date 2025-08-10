package Queues;

public class Arrayqueue {
	int size=5;
	int head=0;
	int tail=-1;
	int []arr=new int [size];
	public void push(int data) {
		if(tail==size-1) {
			System.out.println("Queue overflow");
		}else {
			arr[++tail]=data;
		}
	}
	public void poll() {
		if(head>tail) {
			System.out.println("Queue empty");
			return;
		}
		System.out.println(arr[head]);
		head++;	
	}	
}
