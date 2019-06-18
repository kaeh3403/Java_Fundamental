package java_20190528;

public class CharDemo {
	public static void main(String[] args){
		//문자 표현법	
		char a = 'q';
		
		//유니코드 표현법 '\u0000'
		char b = '\uAE40';
		char c = '\uC131';
		char d = '\uADDC';

		System.out.print(b);
		System.out.print(c);
		System.out.print(d);
		
		//아스키코드 표현법
		char e = 97;
		System.out.println(e);
		
		//이스케이프 캐릭터
		System.out.println("1\ta");
		System.out.println("1\fa");
		
		//문자열 중에서 ",\ 문자로 인식을 못함
		//인식하게 하려면 ",\ 앞에 \를 붙여야 함
		System.out.println("C:\\dev");
		System.out.println("1\"a");
		
		//',\ 두개의 문자는 char에서 인식을 못하기떄문에 두 문자 앞에 \를 붙여 문자로 인식하게 해야 한다.
		char f = '\\';
		char g = '\'';
		char h = '"';
		
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}
}
