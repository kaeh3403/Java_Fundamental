package java_20190531;

import java_20190531.tt.Cat;

public class AccessModifierDemo extends Cat{
	public static void main(String[] args) {
		Car c = new Car();
		//private 같은 클래스에서만 접근가능
		//c.modelNumber = "12";
		
		//default 같은 패키지(디렉토리)에서 접근가능
		c.color = "blue";
		
		//서로 다른 패키지에서 상속받은 경우 접근가능
		c.doorCount = 4;
		
		//서론 다른 패키지에서 접근 가능
		c.price = 10_000_000;
		
		System.out.println(c.color);
		System.out.println(c.doorCount);
		System.out.println(c.price);
				
		
		Cat cat = new Cat();
		cat.nicName = "s";
		
		AccessModifierDemo a = AccessModifierDemo();
		//Cat 클래스를 상속받으면 protected도 접근 가능
		a.age = 10;
		a.nickName = "먼지";
	}
}
