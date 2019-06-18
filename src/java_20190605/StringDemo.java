package java_20190605;

public class StringDemo {
	public static void main(String[] args) {
		String str1 = new String("test");
		String str2 = new String("test");
		
		String str3 = "java";
		String str4 = "java";
		
		//���ڿ��� ����񱳴� equals ���ϴ°��� ����
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));		
		
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));		

		String ssn = "234567-89123456";
		//���ڿ��� Ư�� index�� �ִ� ���ڸ� ��ȯ
		char c = ssn.charAt(6);
		System.out.println(c);
		
		//concat()�� ���ڿ��� ����
		String temp = ssn.concat("Hi");
		System.out.println(temp);
		
		//������ ������ �˾Ƴ� �� ���� ���
		String fileName = "test.zip";
		if(fileName.endsWith("zip")){
			System.out.println("���������Դϴ�.");
		}else if(fileName.endsWith("doc")){
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("�����Դϴ�.");
		}
		
		String url = "naver.com/";
		String uri = "sports/";
		if(uri.startsWith("Sports")){
			System.out.println("�������޴��Դϴ�.");
		}else if(uri.startsWith("news")){
			System.out.println("�����޴��Դϴ�.");
		}else {
			System.out.println("404�������Դϴ�.");
		}
		
		String s1 = "java";
		String s2 = "JAVA";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		s2 = s2.toLowerCase();
		System.out.println(s2);
		
		s1 = s1.toUpperCase();
		System.out.println(s1);
		
		System.out.println(ssn.indexOf("-"));
		System.out.println(ssn.lastIndexOf("-"));
		
		ssn = ssn.replaceAll("-", "*");
		System.out.println(ssn);
		
		String html = "Hi!\n I'm Kim\n Bye.";
		html = html.replace("\n", "<br>");
		System.out.println(html);
		
		String ssn1 = ssn.substring(0,ssn.indexOf("*"));
		String ssn2 = ssn.substring(ssn.indexOf("*")+1);
		
		System.out.println(ssn1);
		System.out.println(ssn2);
		
		//�ڿ������� ã�� �պ��� ���
		fileName = "abc.def.ghi.zip";
		String fileName1 = fileName.substring(0, fileName.lastIndexOf("."));
		String fileName2 = fileName.substring(fileName.lastIndexOf("."));
		
		System.out.println(fileName1);
		System.out.println(fileName2);
				
		fileName1 = "hello";
		fileName1 = "hello ";
		if(fileName1.equals(fileName2)){
			System.out.println("0");
		}else{
			System.out.println("1");
			
		}
		
		int a = 10;
		
		String t1 = String.valueOf(a);
		String t2 = a+"";
		System.out.println(t1);

		//-�� �������� ������
		ssn = "234567-89123-456";
		String[] t3 = ssn.split("-");
		System.out.println(t3[0]);
		System.out.println(t3[1]);
		
		String t4 = String.format("%,.2f and %,.1f", 10000.24,2000000.185);
		System.out.println(t4);
		
		String str = String.format("%f,%f,%f", 1111.11,2222.22,3333.33);
		System.out.println(str);
		
		String stra = String.format("%1$f , %1$f , %1$f" , 1111.11,2222.22,3333.33);
		System.out.println(stra);
		
		String strb = String.format("%3$f , %1$f , %2$f" , 1111.11,2222.22,3333.33);
		System.out.println(strb);
		
		String strc = String.format("%,f , %,f , %,f" , 1111.11,2222.22,3333.33);
		System.out.println(strc);
		
		String strd = String.format("%,20f , %,20f , %,20f" , 1111.11,2222.22,3333.33);
		System.out.println(strd);
		
		String stre = String.format("%,20.2f , %,20.1f , %,20.4f" , 1111.11,2222.22,3333.33);
		System.out.println(stre);
		//[argument_index$] [flags] [width][.precision]
		// 1%					,		20	.f
		String strr = String.format("%1$,20.2f , %2$,20.1f , %3$,20.4f" , 1111.11,2222.22,3333.33);
		System.out.println(stre);
		
		//printf = format
		
		int b1 = 10;
		int b2 = 20;
		System.out.printf("b1�� ���� %d �̰�, %n b2�� ���� %d �Դϴ�",b1,b2);
		
		
		
		
		
		
	}
}
