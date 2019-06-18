package java_20190604;

public class ImplementClass implements InterB, InterC {

	@Override
	public void mB() {
		// TODO Auto-generated method stub
		System.out.println("ImplementClass - mB()");
	}

	@Override
	public void mC() {
		// TODO Auto-generated method stub
		System.out.println("ImplementClass - mC()");

	}

	public static void main(String[] args) {
		InterB b = new ImplementClass();
		b.mB();
		
		InterC c = new ImplementClass();
		c.mC();
	}


}
