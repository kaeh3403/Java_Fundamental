package java_20190604;

public class Triangle extends Shape{
	String dot;
	double angleDegree;
	
	/*Shape 클래스 draw 메소드 오버라이딩(overriding)
		오버라이딩 작성규칙
		1. 메소드 이름 같아야함.
		2. 매개변수 갯수와 자료형이 일치해야함.
		3. 반환형도 같아야함.
		4. 접근 한정자는 부모보다 크거나 같아야함.
	*/
	public void draw(){
		System.out.println("triangle - draw()");
	}

	
	public void drawCoordinate(){
		System.out.println("triangle - drawCoordinate()");
	}
}
