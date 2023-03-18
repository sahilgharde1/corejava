package Exercise;

import java.util.Random;

public class randomNumber {
	public static void main(String[] args) {
		
		//for (int i = 0; i < 5; i++) {
			
			//int j = (int) Math.round((Math.random()*100)) ;
			
			//System.out.println(j);
		
		//METHOD 2
		Random rnum = new Random() ;
			
			
			for (int i = 0; i <5 ; i++) {
				System.out.println(rnum.nextInt(100));
				
			}
			
		
		}
		
}

