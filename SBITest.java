package abstractTest;

public class SBITest extends RBITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loan();
		// RBITest r = new RBITest(); can't create object for abstract class
		SBITest s = new SBITest();
		s.credit();
		s.debit();
		RBITest rs = new SBITest();
		rs.debit();
		rs.debit();
	}

	@Override
	public void credit() {
		System.out.println("SBI CREDIT");
	}

	@Override
	public void debit() {
		System.out.println("SBI DEBIT");
	}

}
