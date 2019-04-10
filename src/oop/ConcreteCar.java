package oop;

public class ConcreteCar extends AbstractCar implements InterfaceCar,InterfaceCar2 {

	@Override
	public void start() {
		
		
	}

	@Override
	public void stop() {
		
		
	}

	@Override
	public void move() {
		System.out.println("moving functionality --generating car concrete --coming from interface");
		autoBreak();
		System.out.println(a);
	}
	//implement --interface all the methods from the interface comes along with the method body
	//extends -- abstract
    // extends first and then implement(second)
	//abstract is like a father
	//implements can be multiple 
	//extend can only be one

	@Override
	public void light() {
		
		
	}
	public void autoHeadLight(int a) {
		System.out.println("headlight -- concreate car");
	
}
}