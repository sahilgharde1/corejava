package core.basic.clonning;

	public class ShallowClonning implements Cloneable{
    
    public double balance;
    
     public ShallowClonning(double balance){
    	 this.balance = balance;
    	 
    	 
     }
@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
     }
	
	
