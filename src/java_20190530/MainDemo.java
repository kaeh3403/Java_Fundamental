package java_20190530;

public class MainDemo {
	public static void main(String[] args) {
		//1. Customer c 에서 customer는 Reference Type, c는  Reference
		//2. new Coustomer()는 Object
	/*	Customer c = new Customer();
		c.name = "김성규";
		c.cphone = "010";
		c.interestRate = 4.3;
		
		c.register();
		Customer c2 = new Customer();
		
		c2.name = "이";
		c2.cphone = "1";
		c.interestRate = 4.5;
		
		c2.register();
		
		//c3 reference를 c2 reference가 가리키는 Object를 참조
		Customer c3 = c2;
		c3.name = "박"; 
		c3.cphone = "2";
		
		c3.register();
		c2.register();*/
		
		Member m = new Member();
		m.setName("tjd");
		m.setCphone("1");
		m.setAddress("dlscjs");
		m.setZipcode("12");
		
		System.out.println(m.getName());
		System.out.println(m.getCphone());
		System.out.println(m.getAddress());
		System.out.println(m.getZipcode());
		
		
	}
}
