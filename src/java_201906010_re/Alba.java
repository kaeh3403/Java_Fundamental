package java_201906010_re;

import java.util.ArrayList;

public class Alba extends Parent{
	String address;
	ArrayList<Alba> list = new ArrayList<Alba>();
	
	public Alba(String name, String cphone, String address) {
		super();
		this.name = name;
		this.cphone = cphone;
		this.address = address;
	}
	
	public void insert(){
		list.add(new Alba(name,cphone,address));
	}
	public void delete(int i){
		list.remove(i);
	}
}
