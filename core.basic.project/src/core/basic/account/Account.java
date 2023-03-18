package core.basic.account;

public class Account {

private int Number = 0;
private String accountType = null;
private double Balance = 0.0;

public final void setNumber (int Number){
	this.Number = Number;
}
public int getNumber(){
	return Number;
}
public void setaccountType (String accountType){
	this.accountType = accountType;
}
public String getaccountType (){
	return accountType;
}
public void setBalance (Double Balance){
this.Balance = Balance;

}
public double getBalance(){
	return Balance;
}

}
