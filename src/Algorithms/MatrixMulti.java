package Algorithms;

public class MatrixMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][]= {{1,2,3},{1,2,3},{1,2,3}};
		int arr2[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int sum[][]=new int[arr1.length][arr2[0].length];
		for(int r=0;r<arr1.length;r++) {
			for(int c=0;c<arr2[0].length;c++) {
				for(int k=0;k<arr1[0].length;k++) {
					sum[r][c]+=arr1[r][k]*arr2[k][c];
				}
			}
		}
		for(int r=0;r<sum.length;r++) {
			for(int c=0;c<sum[r].length;c++) {
				System.out.print(sum[r][c]+" ");
			}
			System.out.println();
		}
		

	}

}
