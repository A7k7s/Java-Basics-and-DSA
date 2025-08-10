package Algorithms;

import java.util.Arrays;

public class Antirotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {9,8,7,6,5};
		for(int i=0;i<arr.length;i++) {
			int f=arr[0];
			for(int j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=f;
			System.out.println(Arrays.toString(arr));
		}
		

	}

}
