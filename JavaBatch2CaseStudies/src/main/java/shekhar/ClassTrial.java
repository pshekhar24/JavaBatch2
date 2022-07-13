package shekhar;

public class ClassTrial {

	public static void main(String[] args) {
		ClassTrial.NestedClass nc = new ClassTrial.NestedClass();
		nc.print();
	}

	
	static class NestedClass {
		
		public void print() {
			System.out.println("hey! how are you;");
		}
	}
}
