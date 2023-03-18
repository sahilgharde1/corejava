package Exercise;

public class MaxNumAry {
public static void main(String[] args) {

    int[]a = {5,45,10,12,5,14,80};
    int max = 0;
    
    for (int i = 0; i < a.length; i++) {
    	if(max<a[i]){
    		max = a[i];
    	}
		
	}
    System.out.println(max);
	
}
}
