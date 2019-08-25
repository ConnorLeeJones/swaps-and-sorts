package Sorts;

import Searches.BinarySearch;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BubbleSortTest {

    private Integer[] testArr;
    private BubbleSort bubbleSort = new BubbleSort();
    private BinarySearch binarySearch = new BinarySearch();

    @Before
    public void setUp() {
        testArr = new Integer[] {13, 1, 6, 46, 3, 106, 85};
    }

    @Test
    public void bubbleSort() {
        System.out.println(Arrays.toString(testArr));
        System.out.println(Arrays.toString(bubbleSort.sort(testArr)));
    }


    @Test
    public void betterBubbleSort() {
        System.out.println(Arrays.toString(testArr));
        System.out.println(Arrays.toString(bubbleSort.betterSort(testArr)));
    }


    @Test
    public void binary() {
        Integer[] arr2dee2 = bubbleSort.betterSort(testArr);
        System.out.println(binarySearch.binarySearch(arr2dee2, 85));
    }

    @Test
    public void binaryFail() {
        Integer[] arr2dee2 = bubbleSort.betterSort(testArr);
            System.out.println(binarySearch.binarySearch(arr2dee2, 227));
    }
}
