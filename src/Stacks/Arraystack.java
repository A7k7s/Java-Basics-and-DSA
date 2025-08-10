package Stacks;

public class Arraystack {
	int capac=5;
	int top=-1;
	int[]arr=new int [capac];
	void push(int data) {
		if(top>capac-1) {
			System.out.println("stack overflow");
			return;
		}arr[++top]=data;
	}
    int pop() {
    	if(top<=-1) {
			System.out.println("Stack under flow");
			return 0;
		}
		return arr[top--];
		
	}
    void peek() {
    	if(top<=-1) {
			System.out.println("Stack under flow");
			return ;
		}
		System.out.println(arr[top]);
    }
    int size() {
    	return top+1;
    }
    boolean isempty() {
    	return top==-1;
    }
}
