package Exercise;

public class FactorialNum {

	public static void main(String[] args) {
		int fact = 1;
		int n = 6																																																																																																						;
		
		for (int i = 1; i <= n; i++) {
			fact=fact*i;
			
		}
		System.out.print("Factorial is "+ fact );
	}

}
