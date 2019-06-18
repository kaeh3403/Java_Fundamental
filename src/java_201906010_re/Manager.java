package java_201906010_re;

import java.util.ArrayList;

public class Manager extends Parent{
	String address;
	String id;
	String pw;
	ArrayList<Manager> list = new ArrayList<Manager>();
	
	public Manager(String name, String cphone, String address, String id, String pw) {
		super();
		this.name = name;
		this.cphone = cphone;
		this.address = address;
		this.id = id;
		this.pw = pw;
		
	}
	
	
	public void insert(){
		list.add(new Manager(name,cphone,address,id,pw));
		
	}
	public void delete(int i){
		list.remove(i);
	}

	

	



}
