package java_20190531;

public class Overloading {
	public void print(int i){
		System.out.println(i);
	}
	public void print(String s){
		System.out.println(s);
	}
	public void print(double d){
		System.out.println(d);
	}

	public void printInt(int i){//메소드 이름은 동사로 정하고 내용을 목적어로 하는것이 좋음.
		System.out.println(i);
	}
	
	public void search(String id){
		
	}
	
	public void search(String f, String e){
		
	}
	
	public void search(String f, String m, String e){
		
	}	
	
	public void search(String zipcde, int flag, String address){
		
	}
	
	
	
}
