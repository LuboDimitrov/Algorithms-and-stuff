package Searches;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int result = binarySearch(arr,0,arr.length-1,6);

    }
    /*

    Binary Search Algorithm: We basically ignore half of the elements just after one comparison.

    1.Compare x with the middle element.
    2.If x matches with the middle element, we return the mid index.
    3.Else If x is greater than the mid element, then x can only lie in the right half subarray after the mid element. So we recur for the right half.
    4.Else (x is smaller) recur for the left half.*/

    public static int binarySearch(int array[], int first, int last, int element){
        if(last >= first){
            int mid = first + (last - first) / 2;
            //2.
            if(array[mid] == element) return mid;

            //if its smaller than the mid element
            if(array[mid] > element) return binarySearch(array, first, mid-1, element);

            //else the element is in the right part
            return binarySearch(array, mid+1, last, element);
        }
        //no such element
        return -1;
    }
}
