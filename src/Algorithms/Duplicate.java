package Algorithms;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,2,3,7,7,7,8,9,10,78,78};
		int dup[]=new int[arr.length];
		int ind=-1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				dup[++ind]=arr[i];
			}
		}	
		for(int g=0;g<ind+1;g++) {
			if(dup[g]!=dup[g+1]) {
					System.out.println(dup[g]);
			}
		}

	}

}
