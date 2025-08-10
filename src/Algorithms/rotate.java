package Algorithms;

import java.util.Arrays;

public class rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,3,4,5,6};
		for(int j=0;j<arr.length;j++) {
			int f=arr[arr.length-1];
			for (int i=arr.length-1;i>0;i--) {
				arr[i]=arr[i-1];
			}
			arr[0]=f;
			System.out.println(Arrays.toString(arr));
		}
		
		

	}

}
