package datastructure;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        //array is fixed values
        //array list is dynamic

        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Apu");
        arrayList.add("Adnan");
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.size());
        System.out.println(arrayList.remove(1));
        System.out.println(arrayList.size());
    }
}
