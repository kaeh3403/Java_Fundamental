package java_20190528;

public class SwitchDemo {
	public static void main(String[] args){
		//args[0] ���α׷� ����� �Է¹޴� ��
		//Integer.parseInt() �޼ҵ�� ���ڿ��� int �� ��ȯ
		int month = Integer.parseInt(args[0]);
		/*if(month==12 || month ==1 || month==2){
			System.out.println(month+"���� �ܿ��Դϴ�.");
		}else if(month==3 || month==4 || month==5){
			System.out.println(month+"���� ���Դϴ�.");
		}else if(month==6 || month==7 || month==8){
			System.out.println(month+"���� �����Դϴ�.");
		}else if(month==9 || month==10 || month==1){
			System.out.println(month+"���� �����Դϴ�.");
		}else{
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		*/
		if(month==12 || month ==1 || month==2){
			System.out.println(month+"���� �ܿ��Դϴ�.");
		}else if(month>=3 && month<=5){
			System.out.println(month+"���� ���Դϴ�.");
		}else if(month>=6 && month<=8){
			System.out.println(month+"���� �����Դϴ�.");
		}else if(month>=9 && month<=1){
			System.out.println(month+"���� �����Դϴ�.");
		}else{
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		
		
		
	}
}
