package Array;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr =new int[] {2,4,3,3,2,1,3,8,9,8,4};
		/*
		 * Arrays.parallelSort(arr); for (int j : arr) { System.out.println(j); }
		 */
			
		for (int i = 0; i < arr.length; i++) {
			if(arr[9]<=arr[i])
			{
				System.out.println(arr[i]);
			}
		}
		
	}

}
