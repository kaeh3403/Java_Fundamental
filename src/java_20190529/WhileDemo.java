package java_20190529;

public class WhileDemo {
	public static void main(String[] args){
		int sum = 0;
		int i=0;
		while(i<=100){
			sum += i;
			i++;
		}
		System.out.println("1~100гу : "+sum);

		
		for(int j=2;j<=9;j++){
			for(int k=1;k<=9;k++){
				System.out.println(j+"X"+k+"="+(j*k));
			}
		}
		
		int j=2;
		while(j<=9){
			int k=1;
			while(k<=9){
				System.out.println(j+"X"+k+"="+(j*k));
				k++;
			}
			j++;
		}

	}
}
