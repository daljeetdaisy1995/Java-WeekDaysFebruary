package oop;

public abstract class AbstractCar {
	//Abstract class
	// to use a abstract class we need to inherit it from class
	    public final int a =10;
        public void autoBreak() {
        	System.out.println("autoBreak Functionality --coming from Abstract Car");
        }
        //we can declare final and static in the abstract class as well
        
        public void autoHeadLight() {
        	
        }
	public AbstractCar() { //this means that an abstractor can have a constructor whereas 
		// a interface can not have a constructor
	
}}
