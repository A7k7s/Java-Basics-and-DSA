package Algorithms;

public class ArrayDiagonalADD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for(int r=0;r<arr.length;r++) {
					sum+=arr[r][r];
		}System.out.println(sum);
	}
}
