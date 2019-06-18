package java_20190605;

import java.text.DecimalFormat;

public class MathDemo {
	public static void main(String[] args) {
		double d1 = Math.ceil(4.5);
		
		System.out.println(d1);
		
		double d2 = Math.floor(4.5);
		System.out.println(d2);
		
		int d3 = Math.round(4.25f);
		System.out.println(d3);

		double d4 = Math.abs(-4321.51);
		System.out.println(d4);
		
		double d5 = Math.max(4.5, 5.7);
		System.out.println(d5);
		
		double d6 = Math.min(45.15, 87.15);
		System.out.println(d6);
		
		double d7 = Math.sqrt(4);
		System.out.println(d7);
		
		double d8 = Math.pow(2, 3);
		System.out.println(d8);
		
		double d9 = Math.random();
		System.out.println(d9);
		
		DecimalFormat cf = new DecimalFormat("#,###.###");
		String str = cf.format(123456.1234);
		
		System.out.println(str);
		
		
	}
}
