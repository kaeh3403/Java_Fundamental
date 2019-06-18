package java_20190605;

public class StringDemo {
	public static void main(String[] args) {
		String str1 = new String("test");
		String str2 = new String("test");
		
		String str3 = "java";
		String str4 = "java";
		
		//문자열의 내용비교는 equals 로하는것이 좋음
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));		
		
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));		

		String ssn = "234567-89123456";
		//문자열중 특정 index에 있는 문자를 반환
		char c = ssn.charAt(6);
		System.out.println(c);
		
		//concat()의 문자열을 연결
		String temp = ssn.concat("Hi");
		System.out.println(temp);
		
		//파일의 종류를 알아낼 때 많이 사용
		String fileName = "test.zip";
		if(fileName.endsWith("zip")){
			System.out.println("압축파일입니다.");
		}else if(fileName.endsWith("doc")){
			System.out.println("문서입니다.");
		}else {
			System.out.println("파일입니다.");
		}
		
		String url = "naver.com/";
		String uri = "sports/";
		if(uri.startsWith("Sports")){
			System.out.println("스포츠메뉴입니다.");
		}else if(uri.startsWith("news")){
			System.out.println("뉴스메뉴입니다.");
		}else {
			System.out.println("404페이지입니다.");
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
		
		//뒤에서부터 찾고 앞부터 계산
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

		//-를 기준으로 나누기
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
		System.out.printf("b1의 값은 %d 이고, %n b2의 값은 %d 입니다",b1,b2);
		
		
		
		
		
		
	}
}
