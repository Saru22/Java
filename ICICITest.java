package interfaceTest;

public class ICICITest implements RBITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void credit() {
		System.out.println("ICICI CREDIT");
	}

	@Override
	public void debit() {
		System.out.println("ICICI DEBIT");
	}

	@Override
	public void loan() {
		System.out.println("ICICI Loan");
	}

}
