package java_20190531;

public class Constructor {
	private String name;
	private String email;
	private int age;
	
	
	

	//디폴트 생성자 : 클래스 내에 생성자가 없는 경우 compiler가 자동으로 생성.
	// 클래스 내에 생성자가 1개라도 있는 경우는 compiler가 생성해주지 않는다.
	// 생성자는 클래스 이름과 같고, 변환값이 없는 형태를 가지고 있다.
	public Constructor(){
		
	}
	
	public Constructor(String name, String email){
		//매개변수 3개짜리 생성자 호출
		this(name,email,0);
		
	}
	//매개 밴수 3개인 생성자
	//메소드의 overloading 처럼 생성자도 overloading이 가능함 
	
	public Constructor(String name, String email, int age){
		//this는 로컬변수와 instrance변수를 구분하기위해 사용
		this.name = name;
		this.email = email;
		this.age = age;
	}
	
	public static void main(String[] args) {
		Constructor c = new Constructor("이름","이메일",10);
		System.out.println(c.name);
		System.out.println(c.email);
		System.out.println(c.age);

	}
}
