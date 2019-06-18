package java_20190604;
//인터페이스 상속은 다중 상속이 가능함.
public interface InterA extends InterB, InterC {
	//인터페이스의 변수 public static final 이 생략되어있음
	double PI = 3.14; 
	//인터페이스 메서드의 접근 한정자를 붙이지 않으면 public이 생략되어있음
	//abstract는 생략가능.
	//public으로 overriding해야함
	void mA();
}
