package java_20190605;

public class WrapperDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		String s1 = "42.5";
		String s2 = "90.2";
		
		//primitive data typedmf WrapperŬ������ ��ȯ int -> Integer
		
		Integer a1 = a;
		Integer a2 = b;
		
		//wrapper class -> primitive data type ��ȯ
		int a3 = a1+ a2;
		
		//String -> primitive data type ��ȯ
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		
		double d3 = d1 + d2;
		
		System.out.println(a3);
		System.out.println(d3);
		
		//boxing : primitive data type => Wrapper class �ڵ� ��ȯ
		Integer a4 = 10;
		Integer a5 = 10;
		
		//unboxing : Wrapper class => primitive data type  �ڵ� ��ȯ
		int a6 = a4 + a5;
		
		
		
	}
}
