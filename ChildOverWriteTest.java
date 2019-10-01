package polyTest;

public class ChildOverWriteTest extends ParentOverwriteTest { //override

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildOverWriteTest ch = new ChildOverWriteTest();
		ch.exe();
		//super.add(); super keyword not allowed in static keyword
	}
	public static void add() {
		
		System.out.println("Child add");
		
	}

	public void exe() {
		super.add();//it will point the parent class,super will call the immediate parent then only super parent
		
		add(); //same class
		
		this.add(); //it will point the current class global variable
	}
}
