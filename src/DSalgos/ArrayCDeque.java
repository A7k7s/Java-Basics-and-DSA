package DSalgos;

public class ArrayCDeque {
		int capacity=5;
		int size=0;
		int front=-1;
		int rear=-1;
		int arr[]=new int[capacity];
		public void addrear(int data) {
			if(size==capacity) {
				System.out.println("Stack overflow");
				return;
			}
			if(rear==-1&&front==-1) {
				arr[0]=data;
				rear++;
				front++;
				size++;
				return;
			}rear=(rear+1+capacity)%capacity;
			arr[rear]=data;
			System.out.println(arr[rear]+"added at rear");
			size++;
			System.out.println(size+" "+front+" "+rear+" ");
		}
		public void addfront(int data) {
			if(size==capacity) {
				System.out.println("Stack overflow");
				return;
			}if(rear==-1&&front==-1) {
				arr[0]=data;
				rear++;
				front++;
				size++;
				return;
			}front=(front-1+capacity)%capacity;
			arr[front]=data;
			System.out.println(arr[front]+"added at front");
			size++;
			System.out.println(size+" "+front+" "+rear+" ");
		}
		public void poll() {
			if(front==-1&&rear==-1) {
				System.out.println("Queue empty");
				return;
			}System.out.println(arr[front]);
			front=(front+1+capacity)%capacity;
			size--;
		}
		public void polllast() {
			if(size==0) {
				System.out.println("Queue empty");
				return;
			}System.out.println(arr[rear]);
			rear=(rear-1+capacity)%capacity;
			size--;
		}

}

