package java_20190607;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer();
		StringBuffer s2 = new StringBuffer();
		
		s1.append("select name, age ");
		s1.append("from member ");
		s1.append("where name = '김' ");
		s1.append("order by name desc ");
		
		s2.append("select name, age ");
		s2.append("from member ");
		s2.append("where name = '김' ");
		s2.append("order by name desc ");
		
		
		System.out.println(s1 == s2);
		//StringBuffer의 equals() 메서드는 Object 클래스의 equals()가 아니라서 문자열 비교 불가
		System.out.println(s1.equals(s2));
		
		String s3 = s1.toString();
		String s4 = s2.toString();
		
		System.out.println(s3.equals(s4));
		
		//s1의 값을 모두 지워 초기화하기
		s1.setLength(0);
		
		s1.append("select no, writer from board");
		//StringBuffer 클래스는 Object의 toString() 메서드를 오버라이딩 했기때문에 StringBuffer클래스의 문자열이 출력됨
		System.out.println(s1.toString());
		
		
		
		
	}
}
