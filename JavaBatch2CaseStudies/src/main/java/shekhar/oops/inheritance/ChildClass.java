package shekhar.oops.inheritance;

public class ChildClass extends ParentClass {

	public ChildClass(int i) {
		super(i);
	}

	@Override
	protected void printI() {
		super.printI();
		i=20;
		System.out.println(i);
	}
}
