package inheritanceTest;

public class RBITest extends WorldBankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WorldBankTest.credit();
		credit();
		debit();
		eduloan();
		interest = interest+1;
		System.out.println("Rbi Interest" + interest);
	
	}
	public static void eduloan() {
		System.out.println("RBI TEST EDU");
	}

}
