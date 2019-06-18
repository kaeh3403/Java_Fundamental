package java_201906010;

public class TryCatchFinallyDemo {
	public static double average(int a, int b){
		int sum = a + b;
		return (double)sum / (double)2;
	}
	
	public static void main(String[] args) {
		if(args.length !=2){
			System.err.println("usage : java TryCatchFinallyDemo " + "[��������] [��������]");
			return;
		}
		
		//Integer.parseInt() �޼���� ���ڰ� �ƴ� ���ڿ��� ��� ��, �Ϲ� ���ڿ��� ��� NumberFormatException ���ܰ� �߻���.
		
		try {
			int korea = Integer.parseInt(args[0]);
			//���ڸ� �Է��� ���, JVM�� ������ ������Ű��, ���ܰ�ü�� NumberFormatException ��ü�� ������ �� catch ���� ã�´�.
			int english = Integer.parseInt(args[1]);
			double avg = average(korea, english);
			System.out.printf("��� : %.2f",avg);
			
		} catch (NumberFormatException e) {
			
			//JVM �޼����� �����ϰ� ��µ�
			e.printStackTrace();
			System.err.println("���� : "+e.getMessage());
			System.err.println("�����Է�");
			
		} catch (ArrayIndexOutOfBoundsException e){
			
		}
		
		finally{
			System.out.println("finally block");
		}
	}

}
