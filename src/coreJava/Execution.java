package coreJava;

public class Execution {
public static void main(String [] args) {
	
	//Object Creation Of A Class
	Computer refVar1 = new Computer();
	//Class Name + reference variable = new + constructor name
     refVar1.model = "Asus";
     System.out.println(refVar1.model);
	
     Computer refVar2 = new Computer(2019);
     
     Computer refVar3 = new Computer("Mac");
	
     System.out.println(refVar1.display);
     System.out.println(Computer.keys);
     
     //Math
     Math math = new Math();
    int newValue =  math.calculator1(7,8);
    System.out.println(newValue);
     
     int newValue2= Math.calculator2(10, 5);
     System.out.println(newValue2);
     

     
     
     math.getAddress();
	/*Method name can be same or different as the class name 
     but constructor name has to be same as the class name*/
     
     Math.getTime();
     
     
}
public static void method () {
	System.out.println(Computer.keys);
}
}
