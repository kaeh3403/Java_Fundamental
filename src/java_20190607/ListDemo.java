package java_20190607;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		//데이터의 중복을 혀용하고, 순서를 관리한다
		ArrayList<String> list = new ArrayList<String>();
		//입력 add(객체)
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		//출력 get(인덱스)
		for (int i = 0; i < list.size(); i++) {
			String temp = list.get(i);
			System.out.println(temp);
			
		}
		
		for(String temp : list){
			System.out.println(temp);
		}
		
		list.remove(2);
		
		String temp = list.get(2);
		System.out.println(temp);
	}
}
