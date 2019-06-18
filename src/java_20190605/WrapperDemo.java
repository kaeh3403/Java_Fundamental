package java_20190605;

public class WrapperDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		String s1 = "42.5";
		String s2 = "90.2";
		
		//primitive data typedmf Wrapper클래스로 변환 int -> Integer
		
		Integer a1 = a;
		Integer a2 = b;
		
		//wrapper class -> primitive data type 변환
		int a3 = a1+ a2;
		
		//String -> primitive data type 변환
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		
		double d3 = d1 + d2;
		
		System.out.println(a3);
		System.out.println(d3);
		
		//boxing : primitive data type => Wrapper class 자동 변환
		Integer a4 = 10;
		Integer a5 = 10;
		
		//unboxing : Wrapper class => primitive data type  자동 변환
		int a6 = a4 + a5;
		
		
		
	}
}
