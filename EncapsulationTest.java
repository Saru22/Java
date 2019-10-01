package encapsulationTest;

public class EncapsulationTest {

	
private int custID;
private String cusName;
private int balance;

public void setcustID(int custID)
{
	this.custID = custID;
	
	
}
	public int getcustID() {
		return custID;

}
	
	public void setcusName(String cusName) {
		this.cusName = cusName;
}
	
	public String getCusName() {
		return cusName;
		
	}
	
	public void setbalance(int balance) {
		this.balance = balance;
	}
	
	public int getbalance() {
		return balance;
		
	}
}
	