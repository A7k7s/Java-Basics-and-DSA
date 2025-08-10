package Algorithms;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int arr2[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int sum[][]=new int[3][3];
		for(int r=0;r<arr1.length;r++) {
			for(int c=0;c<arr1[r].length;c++) {
				sum[r][c]=arr1[r][c]+arr2[r][c];
			}
		}
		for(int r=0;r<3;r++) {
			for(int c=0;c<3;c++) {
				System.out.print(sum[r][c]+" ");
			}
			System.out.println();
		}
		

	}

}
