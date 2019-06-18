package java_20190607;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ConsoleApplication {
	private ArrayList<Member> list;
	public ConsoleApplication(){
		list = new ArrayList<Member>();
	}
	
	public void print(){
		System.out.println("***********************************************");
		System.out.println("1. Insert 2. Update 3. Delete 4. Search 5. Exit");
		System.out.println("***********************************************");
		
	}
	
	//키보드로 입력받은 한줄을 반환하는 함수
		public String console(String message) throws IOException{
			System.err.print(message);
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			return br.readLine();
		}
	public void execute(String message) throws IOException{
		if(message.equals("1")){
			insert();
		}else if(message.equals("2")) {
			update();
		}else if(message.equals("3")) {
			delete();
		}else if(message.equals("4") ){
			search();
			
		}else{
			System.out.println("종료");
		}
	}
	//1. 아이디를 입력받는다
	//2. 이름을 입력받는다
	//3. ArrayList에 추가한다.
	//4. ArrayList에 있는 모든 고객을 출력한다.
	//5. print() 함수호출
	//6. 선택하세요 : 메세지 출력후 키보드 입력받을 준비
	public void insert() throws IOException{
		String id = console("아이디 : ");
		String name = console("이름 : ");
		Member m = new Member(name, id);
		list.add(m);
		
		for(Member m1 : list){
			System.out.printf("아이디 : %s, 이름 : %s%n",m1.getId(),m1.getName());
					
		}
		print();
		String message =  console("선택하세요 : ");
		execute(message);
	}
	//1. 아이디를 입력받는다
	//2. ArrayList 에서 수정할 아이디를 찾아서 있으면 수정할 이름을 입력받고, 없으면 '수정할 아이디가 없습니다.' 출력 
	//3. ArrayList에 있는 모든 고객을 출력한다.
	//4. print() 함수호출
	//5. 선택하세요 : 메세지 출력후 키보드 입력받을 준비
	
	public void update() throws IOException{
		String updateId = console("수정할 아이디 : ");
		boolean isExisted = false;
		for(Member m : list){
			if(updateId.equals(m.getId())){
				isExisted = true;
				break;
			}
		}
		if(isExisted){
			String updateName = console("수정할 이름 : ");
			for (int i = 0; i < list.size(); i++) {
				Member m1 = list.get(i);
				if(updateId.equals(m1.getId())){
					/*list.remove(i);
					list.add(new Member(updateName,updateId));
					*/
					m1.setName(updateName);
					
					break;
				}
				
			}
		}else{
			System.out.println("수정할 아이디가 없습니다.");
		}
		
		common();
	}
	public void delete() throws IOException{
		String deleteId = console("삭제할 아이디 : ");
		boolean isExisted = false;
		for(int i = 0; i<list.size();i++){
			Member m = list.get(i);
			if(deleteId.equals(m.getId())){
				isExisted = true;
				list.remove(i);
				
				break;
			}else{
				System.out.println(" 삭제할 아이디가 없습니다.");
				
			}
		}
		common();
	}
	public void search() throws IOException{
		String searchId = console("검색할 아이디 : ");
		System.out.println("************************검색결과*********************");
		boolean isExisted = false;
		for(Member m : list){
			if(searchId.equals(m.getId())){
				isExisted = true;
				System.out.println(m);
				break;
			}else{
				System.out.println("검색된 아이디가 없습니다.");
		}
	}
		common();
		
	}

	private void common() throws IOException {
		for(Member m1 : list){
			System.out.println(m1);
					
		}
		print();
		String message =  console("선택하세요 : ");
		execute(message);
	}
	
		
	public static void main(String[] args) throws IOException{
		ConsoleApplication c = new ConsoleApplication();
		c.print();
		String message = c.console("선택하세요 : ");
		c.execute(message);
		
	}
	
	
}
