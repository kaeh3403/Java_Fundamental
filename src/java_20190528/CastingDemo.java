package java_20190528;

public class CastingDemo {
	public static void main(String[] args) {
		//byte 범위를 넘어가면 에러발생
		//캐스팅자치는 가능하지만 circuit이 발생해 원치않은 결과를 초래하므로 좋은방법이 아님.
		
		byte a = (byte)128;
		System.out.println(a);
		
		//float, double로 캐스팅하는 경우는 소수점 이하 짤림
		//cut 발생
		int b = (int)42.5;
		System.out.println(b);
		
		double c = (double)42/4;
		System.out.println(c);	
	}
}
