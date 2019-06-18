package java_20190604;

public class OverridingDemo {
	public static void main(String[] args) {
		//Shape shape = new Shape(); new를 생성할 수 없음.
		
		Triangle t = new Triangle();
		
		t.draw();
		
		Rectangle r = new Rectangle();
		r.draw();
		
		Pentagon p = new Pentagon();
		p.draw();
		
		Shape s = new Triangle();
		s.name = "삼각형";
		s.degree = 60;
		s.drawLine();
		s.draw();//Shape의 draw() 호출되지 않고 Triangle의 draw() 호출됨
		/*s.dot = "";
		s.angleDegree = 180;
		s.drawCoordinate();
		*/
		
		
		
		
	}

}
