package java_20190605;

public class ArgVarDemo {
	//인자를 여러개 연산(... 은 배열과 비슷)
	public int plus(int... temp){
		int sum = 0;
		/*for (int i = 0; i < temp.length; i++) {
			sum += temp[i];
		*/
		
		for(int value : temp){
			sum += value;
		
	}
		return sum;
	}
	
	public static void main(String[] args) {
		ArgVarDemo d = new ArgVarDemo();
		
		int a = d.plus(1);
		System.out.println(a);
		
		int b = d.plus(1,2);
		System.out.println(b);
		
		int c = d.plus(1,23,253,13,1);
		System.out.println(c);
				
	}
	
	
}
