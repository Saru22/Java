package encapsulationTest;

public class EncapRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationTest e = new EncapsulationTest();
		e.setcustID(111);
		System.out.println("customer is active" + e.getcustID());
		e.setcusName("CUSNAME");
		System.out.println("your requested cust name is"+e.getCusName());
		e.setbalance(5555);
		System.out.println("your balance" + e.getbalance());

	}
}
