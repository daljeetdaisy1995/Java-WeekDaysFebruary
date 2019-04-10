package oop;

public class TestEncapsulation {
	//where ever we have to change depending on the requirement
	// when we are not sure what our data can be
	//and we have everything private we can use getter and setter

	public static void main(String[] args) {
		Encapsulation encapsulation = new Encapsulation();
		encapsulation.setID(100);
		System.out.println(encapsulation.getID());

	
		
	    encapsulation.setName("Daljeet");
			System.out.println(encapsulation.getName());

	}

}
