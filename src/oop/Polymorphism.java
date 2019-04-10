package oop;

public class Polymorphism extends ConcreteCar{
	//Method Overloading
	//same method , different parameters, in same class
	
	public void calculator(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	public void calculator(int a, int b, int d) {
		int c = a+b;
		double g = c/d;
		System.out.println(g);
	}
	
	//Method Overriding
	//it over rides the previous methods 
	//same method , different parameters, in different class(uses extend)
	//you can over ride the methods if they have empty parameter or if they have any parameter
	@Override
	public void autoHeadLight(int a) {
		System.out.println(a+ "headlight -- polymorphism class");
    	
    }

	
	
	
	public static void main(String[] args) {
		Polymorphism polymorphism  = new Polymorphism();
		polymorphism.calculator(10,12);
		polymorphism.calculator(10,12,2);
		
		polymorphism.autoHeadLight(22);
		

	}

}
