package java_20190528;

public class CastingDemo {
	public static void main(String[] args) {
		//byte ������ �Ѿ�� �����߻�
		//ĳ������ġ�� ���������� circuit�� �߻��� ��ġ���� ����� �ʷ��ϹǷ� ��������� �ƴ�.
		
		byte a = (byte)128;
		System.out.println(a);
		
		//float, double�� ĳ�����ϴ� ���� �Ҽ��� ���� ©��
		//cut �߻�
		int b = (int)42.5;
		System.out.println(b);
		
		double c = (double)42/4;
		System.out.println(c);	
	}
}
