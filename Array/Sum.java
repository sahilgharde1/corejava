package Array;

public class Sum {

	public static void main(String[] args)
	{
		int [] arr = new int[] {2,2,2,2,2,2};
		int sum =0;
		for(int i=0; i < arr.length; i++)
		{
			sum=(sum+arr[i]);
		}
		System.out.println("Sum of all Element:" + sum);
	}

}
