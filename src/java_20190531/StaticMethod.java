package java_20190531;

public class StaticMethod {
	static String name;
	int age;
	
	public void m1(){
		name = "국민";
		age = 10;
		m2();
		m4();
	}
	public void m2(){
		System.out.println("instance method m2()");
	}
	public static void m3(){
			name = "국민";//static 메소드에서는 instance 변수 접근 가능
			//age = 10; static 메소드에서는 instance 변수 접근 불가
			//m2(); static 메소드에서는 instance 메소드 호출 불가
			m4(); //static 메소드에서는 instance 메소드 호출 가능
		
	}
	public static void m4(){
		System.out.println("instance method m4()");
	}
	public static void main(String[] args) {
		StaticMethod.m4();
		StaticMethod.name = "신한";
		
		StaticMethod sm = new StaticMethod();
		sm.age = 10;
		sm.m1();
		sm.m2();
		
	}
}
