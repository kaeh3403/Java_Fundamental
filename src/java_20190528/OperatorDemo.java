package java_20190528;

public class OperatorDemo {
	public static void main(String[] args) {
		/*
		 * �޷¸����
		 * 1. 1�� 1�� 1���� ������
		 * 2. ������ 4�⸶�� �߻��ϰ� ���߿� 100���� ����� �����ϰ� 400���� ����� �������� �ʴ´�.
		 * - 2019�� 5�� 28���� ������ ���Ϸ���
		 *   2018�� ���� �� �ϼ��� ���ϰ�, 1��~4������ �ϼ��� ���ϰ� 28���� ���ϸ� �� �ϼ��� ����
		 * - �� �ϼ��� 7�� ���� �������� 1�̸� �������̵ȴ�.
		 * 
		 */
		
		int year = 2019;
		int month = 5;
		int date = 28;
		
		int preYear = year-1;
		int preMonth = month-1;
		
		
		int totalCnt = 0;
		//2018�⵵ �� �ϼ�
		totalCnt = preYear * 365 + (preYear/4 - preYear/100 + preYear/400);
		
		//2019�⵵ 4�� ������ �ϼ�
		
		totalCnt += 31+28+31+30;
		totalCnt += date;
		
		int rest = totalCnt % 7;
		
		System.out.println(rest);
				
		
		int temp = 123;
		int share = temp%10==0 ? temp/10 : temp/10 +1;
		
		
		
		
		
		
	}

}
