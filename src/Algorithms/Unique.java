package Algorithms;

public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,2,3,7,7,7,8,9,10,10,10};
		int sto[]=new int[arr.length];
		int ind=-1;
		if(arr[0]!=arr[1]) {
			sto[++ind]=arr[0];
		}
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1] && arr[i]!=arr[i-1]) {
				sto[++ind]=arr[i];
			}
		}
		if(arr[arr.length-1]!=arr[arr.length-2]) {
			sto[++ind]=arr[arr.length-1];
		}
		for(int g=0;g<ind+1;g++) {
			System.out.println(sto[g]);
		}

	}

}
