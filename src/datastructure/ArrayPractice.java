package datastructure;

public class ArrayPractice {

    public static void main(String[] args) { //psvm


        String[] employeesName = {"Apu", "Adnam"};
        int[] salary = {1000, 2000, 3000};

        int[] Identification = new int[2];
        Identification[0] = 100;
        Identification[1] = 1000;
        try {
            Identification[2] = 2000;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("exception caught");
        }
       // Identification[2] = 2000;
        System.out.println(Identification[1]);

        //row and column
        String multiDimensionalArray [][] = new String[3][3];

        for (int i = 0; i < multiDimensionalArray.length; i++) {
            for (int j = 0; j < multiDimensionalArray.length; j++) {
               multiDimensionalArray [0][0] = "hey";
            }
        }
        System.out.println(multiDimensionalArray[0][0]);

        //Object
        //Can store any datatypes
        Object[] employeesInfo = {"Apu",10};
        System.out.println(employeesInfo[1]);

            }


        }





