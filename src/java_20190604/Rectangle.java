package java_20190604;

public class Rectangle extends Shape{
	@Override
	public void draw() {
		//부모의 기능을 모두 사용하고 더해서 사용하겠다.
		System.out.println("Rectangle - draw()");
	}

}
