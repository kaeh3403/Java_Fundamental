package java_20190530;

public class Customer {
	//instance variable (��������)
	String name;
	String cphone;
	//static variable (���뺯��)
	static double interestRate ;
	static final String BANKNAME = "��������";
	
	public void register(){
		System.out.println("���� ��ϵǾ����ϴ�.");
		System.out.println("�̸� : "+ name + ", ��ȣ : "+ cphone + "������ " + interestRate + "����� : "+ BANKNAME);
	}
	
	
}
