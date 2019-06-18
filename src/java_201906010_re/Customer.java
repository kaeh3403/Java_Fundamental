package java_201906010_re;

import java.util.ArrayList;

public class Customer extends Parent{
	
	ArrayList<Customer> list = new ArrayList<Customer>();

	public Customer(String name, String cphone) {
		super();
		this.name = name;
		this.cphone = cphone;
	}
	
	public void insert(){
		list.add(new Customer(name,cphone));
	}
	public void delete(i){
		list.remove(i);
		
	}
}
