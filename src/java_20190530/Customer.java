package java_20190530;

public class Customer {
	//instance variable (개별변수)
	String name;
	String cphone;
	//static variable (공통변수)
	static double interestRate ;
	static final String BANKNAME = "신한은행";
	
	public void register(){
		System.out.println("고객이 등록되었습니다.");
		System.out.println("이름 : "+ name + ", 번호 : "+ cphone + "이자율 " + interestRate + "은행명 : "+ BANKNAME);
	}
	
	
}
