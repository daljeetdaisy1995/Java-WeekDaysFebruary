package coreJava;

import java.util.ArrayList;

public class Loops {

	public static void main(String[] args) {
		//Loops
		
		//For loop
		
		//write value of x 5 times
		//s = 0 means this is where my condition starts
		//s<6 means this is where my condition ends
		//++ means incremental
		// -- means decremental
		for(int s = 0; s <= 4;s++) {
		System.out.println("value of x is : 1"+s); // java knows that the loop needs to be run five times
		System.out.println(s);
		System.out.println("********");
		/*System.out.println("value of x is : 1");
		System.out.println("value of x is : 1");
		System.out.println("value of x is : 1");
		System.out.println("value of x is : 1");
		System.out.println("value of x is : 1");*/

		}
		
		//while loop
		int a = 0;
		while(a<5) {
			System.out.println("I love java : And value of s is ="+a);
			a++;
			System.out.println("*******");
		}
		
		//enhanced for loop
		//create an array and insert 3 names
		String array[] = {"Jeff", "Daljeet", "Winsen"};
		int array2[]= {1,2,3,4};
		System.out.println("the length of array is :"+array.length);
		for (String s: array) {
			System.out.println("My name is "+s);
			
		}
		
		//do while
		int z = 10;
		do {
			System.out.println("my number is "+z);
			z++;
		}
		while (z<20);
		
		ArrayList <String> arrayList = new ArrayList<>();
		System.out.println(arrayList.size());
		
		for(int b = 0; b <5; b++) {
		arrayList.add("Daljeet");
		}
		System.out.println(arrayList.size()); // size of the array
		System.out.println(arrayList.get(0)); // 0 value of the array list
		
		}
}

		
		
	
	

		
	


