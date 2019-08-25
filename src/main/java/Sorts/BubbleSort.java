package Sorts;

public class BubbleSort {


    public Integer[] sort(Integer[] arr){
        //always O(n^2)
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length -1; j++) {
                if (arr[j] > arr[j+1]){
                    Integer temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
       return arr;
    }

    public Integer[] betterSort(Integer[] arr){
        //always O(n^2)
        boolean swapped = false;
        do {
            for (int i = 0; i < arr.length - 1; i++) {
                swapped = false;
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        Integer temp = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = temp;
                        swapped = true;
                    }
                }
            }
        } while (swapped);
        return arr;
    }

//    public Integer[] betterSort2(Integer[] arr){
//        //always O(n^2)
//        boolean swapped = true;
//        while(swapped){
//            for (int i = 0; i < arr.length - 1; i++) {
//                swapped = false;
//                for (int j = 0; j < arr.length - i - 1; j++) {
//                    if (arr[j] > arr[j + 1]) {
//                        Integer temp = arr[j + 1];
//                        arr[j + 1] = arr[j];
//                        arr[j] = temp;
//                        swapped = true;
//                    }
//                }
//            }
//        }
//        return arr;
//    }



}
