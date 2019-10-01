package interfaceTest;

public class SBITest implements RBITest {

	public static void main(String[] args) {

		// RBITest R = new RBITest(); - for interface cannot create object

		SBITest s = new SBITest();//both interface n child calss functions
		s.credit();
		s.debit();
		s.loan();
		RBITest rs = new SBITest();// only if we need to call interface functions
		rs.credit();
		rs.debit();
		rs.loan();
		s.exe();
		// rs.exe(); not visible
	//	interest = interest+1; - constance variable its fixed one should not changed the value but we can call the variable,by default it is set as final

	}

	/*
	 * @Override public void credit() { // TODO Auto-generated method stub
	 * 
	 * } implementation is compulsory
	 */

	@Override//functions implemented from interface
	public void debit() {
		System.out.println("SBi DEbit");
	}

	@Override
	public void loan() {
		System.out.println("Sbi loan");
	}

	@Override
	public void credit() {
		System.out.println("Sbi credit");
	}

	public void exe() {
		System.out.println("SBI EXE");
	}

}
