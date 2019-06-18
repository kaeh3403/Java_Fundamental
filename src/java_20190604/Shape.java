package java_20190604;

public abstract class Shape {
	String name;
	double degree;
	
	public abstract void draw();

	public void drawLine(){
		System.out.println("Shape - drawLine()");
	}
}
