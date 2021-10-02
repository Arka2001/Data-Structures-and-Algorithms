package Searching_Algorithms;
import java.util.Scanner;

public class binarySearch {

    // Binary Search works only on Sorted Array

    static int search(int[] arr, int n){

        // initialise start and end pointers
        int start = 0, end = arr.length-1;

        while(start<end){
            // initialise middle element index
            int mid = start + (end-start)/2;

            // if middle element is equal to n, return the index
            if(arr[mid] == n)
                return mid;
            // if the middle element greater than n, then the element is to the left of middle element. Then change end = mid-1
            else if(arr[mid] > n)
                end = mid - 1;
            // else the element is to the right of the middle element. Then change start = mid + 1
            else
                start = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {15, 23, 65, 98, 125, 165};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to find: ");
        int findElement = sc.nextInt();
        int result = search(arr, findElement);
        if(result == -1)
            System.out.println("The element is not present in the array");
        else
            System.out.println("The element is present at index " + result);
        sc.close();
    }
}