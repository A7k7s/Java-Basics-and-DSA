package Algorithms;

public class Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=19999976;
		int arr[]=new int[10];
		while(n>0) {
			arr[n%10]++;
			n=n/10;
		}
		int max=arr[0];
		int ind=0;
		for (int i=0;i<10;i++) {
			if(max<=arr[i]) {
				max=arr[i];
				ind=i;
			}
		}System.out.println(ind);
	}
}
