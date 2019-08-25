package Sorts;

import java.util.Arrays;
import java.util.HashMap;

public class SelectSort {

    public static Integer[] sort(Integer[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int mindex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[mindex]){
                    mindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }
        return arr;
    }


    public static void main(String[] args) {
        Integer[] sortMe = { 45, 2, 3,  100, 6, 55, 700, 1};
        System.out.println(Arrays.toString(SelectSort.sort(sortMe)));
    }
}
