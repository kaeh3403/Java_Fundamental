package java_20190528;

public class CharDemo {
	public static void main(String[] args){
		//���� ǥ����	
		char a = 'q';
		
		//�����ڵ� ǥ���� '\u0000'
		char b = '\uAE40';
		char c = '\uC131';
		char d = '\uADDC';

		System.out.print(b);
		System.out.print(c);
		System.out.print(d);
		
		//�ƽ�Ű�ڵ� ǥ����
		char e = 97;
		System.out.println(e);
		
		//�̽������� ĳ����
		System.out.println("1\ta");
		System.out.println("1\fa");
		
		//���ڿ� �߿��� ",\ ���ڷ� �ν��� ����
		//�ν��ϰ� �Ϸ��� ",\ �տ� \�� �ٿ��� ��
		System.out.println("C:\\dev");
		System.out.println("1\"a");
		
		//',\ �ΰ��� ���ڴ� char���� �ν��� ���ϱ⋚���� �� ���� �տ� \�� �ٿ� ���ڷ� �ν��ϰ� �ؾ� �Ѵ�.
		char f = '\\';
		char g = '\'';
		char h = '"';
		
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}
}
