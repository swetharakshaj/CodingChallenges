package Sorting;

import static Sorting.util.printArray;
import static Sorting.util.swap;

public class BubbleSort
{

    private static void bubbleSort(int[] arr) {
        boolean isSorted = false;
        int lastSortedEle = arr.length-1;
        while(!isSorted) {
            isSorted = true;
            for(int i=0; i < lastSortedEle; i++) {
                if(arr[i] > arr[i+1])
                {
                    swap(arr, i, i+1);
                    isSorted = false;
                }
            }
            lastSortedEle--;
        }
    }


    public static void main(String[] args) {
        int[] array1 = new int[] {9, 2, 11, 2, 7, -2, 0};
        bubbleSort(array1);
        printArray(array1);

    }
}
