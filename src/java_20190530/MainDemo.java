package java_20190530;

public class MainDemo {
	public static void main(String[] args) {
		//1. Customer c ���� customer�� Reference Type, c��  Reference
		//2. new Coustomer()�� Object
	/*	Customer c = new Customer();
		c.name = "�輺��";
		c.cphone = "010";
		c.interestRate = 4.3;
		
		c.register();
		Customer c2 = new Customer();
		
		c2.name = "��";
		c2.cphone = "1";
		c.interestRate = 4.5;
		
		c2.register();
		
		//c3 reference�� c2 reference�� ����Ű�� Object�� ����
		Customer c3 = c2;
		c3.name = "��"; 
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
