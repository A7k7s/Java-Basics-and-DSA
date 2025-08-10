package Algorithms;


public class Distinct {
    // store distinct element in another array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,2,3,7,7,7,8,9,10,10,10};
		int sto[]=new int[arr.length];
		int ind=-1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				sto[++ind]=arr[i];
			}
		}
		sto[++ind]=arr[arr.length-1];
		for(int g=0;g<ind+1;g++) {
			System.out.println(sto[g]);
		}

	}

}
