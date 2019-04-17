package sortingAlgorithm;

public class BubbleSort {
    public static void main(String[] args) {


        //print java 5 times
        //after each time of printing java print selenium 3 times

        /*for (int a =0;a<5;a++){
            System.out.println("Java printed for the " +(a+1)+ " 'st time'");
            for(int j =0;j<3; j++){
            if(j==3){
            System.out.println("Selenium"+(j+1)+" 'st time");
            }else
                System.out.println("Selenium"+(j+1)+" 'st time");
            }
        }*/


        int ArrayNumber[] = {0, 12, 34, 11, 55, 90, -1};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(ArrayNumber);
        System.out.print("Sorted Array");
        for (int a =0; a<ArrayNumber.length; a++) {
            System.out.print(ArrayNumber[a] + " ");
        }
        }

        public void bubbleSort ( int array[]){
            int n = array.length;

            for (int i = 0; i < n ; i++) { //n will run n number of times means running one time extra 7 times
                for (int j = 0; j < n - 1; j++) { // n-1 runs till one less than the total 6 times
                    if (array[j] > array[j + 1]) {
                        //swap array[j+1] with array [j]

                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }

        }
    }

