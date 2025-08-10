package Algorithms;

import java.util.Arrays;

public class Selectionsort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ord[]= {100,4,76,89,76,6};
		for(int i=0;i<ord.length-1;i++) {
			for (int j=i+1;j<ord.length;j++) {
				int temp=ord[i];
				if(ord[i]>ord[j] ) {
					ord[i]=ord[j];
					ord[j]=temp;
				}	
			}
		}
		System.out.println(Arrays.toString(ord));
	}
}
