package core.basic.clonning;

public class Account {

	int Balance = 0;
	
	public void setBalance (int balance){
		this.Balance = balance;
	}
	public int getBalance (){
		return Balance;
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}
