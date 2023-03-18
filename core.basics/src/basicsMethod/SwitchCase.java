package basicsMethod;

public class SwitchCase {
	public static void main(String[] args) {
		int size = args.length;
		switch(size){
		case 0:
			System.out.println("case 0");
			System.out.println("hello to all");
			break;
			
		case 1:
			System.out.println("case 1");
			System.out.println("hello" +args[0]);
			break;
			
		case 2:
			System.out.println("case 2");
			System.out.println("hello" +args[0]);
			System.out.println("hello" +args[1]);
			break;
			
		default:
			System.out.println("default");
			for(int i=0; i<size; i++){
				System.out.println("hello" +args[i]);
			}
			
		}
	}
	}

