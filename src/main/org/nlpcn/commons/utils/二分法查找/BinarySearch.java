package main.org.nlpcn.commons.utils.二分法查找;

/**
 * Created by slade on 2019/9/2.
 */

/*
*   二分查找的前提是有序的
* */
public class BinarySearch {
    public int binarysearch(int[] array, int destElement) {
        int begin = 0;
        int end = array.length - 1;


        while (begin <= end) {
            int middle = (begin + end) / 2;
            if (array[middle] == destElement) {
                return middle;
            }

            if (array[middle] > destElement) {
                end = middle - 1;
            } else if (array[middle] < destElement) {
                begin = middle + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] a = {1, 3, 5, 9, 10, 11, 13, 56};

        BinarySearch binarySearch = new BinarySearch();

        int index = binarySearch.binarysearch(a, 10);

        System.out.println(index);


    }
}
