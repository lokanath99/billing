package myprog;


public class Cashier {
	
	
	
	String name;
	int Id;
	
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	
	
	Cashier(){
		name=null;
		Id=0;
	}
	
	
	Cashier(String na,int id) {
	name=na;
	Id =id;
	}
	
	
	public void Cadisplay() {
		System.out.print("Cashier :"+name);
		System.out.println("id :"+Id);
	}
	


}
