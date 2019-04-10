package oop;

public class Encapsulation {
	private int ID;
	private String Name ;
	//when we have private modifiers we can not call them in other classes by creating an object creation
	//we need to use getter and setter method
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

	
	
	
}
