import java.util.*;

public class arrays {
    public static Scanner scn = new Scanner(System.in);

    public static int[] input1(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static void display1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int maximum(int[] arr) {
        int maxEle = -(int) 1e9;
        for (int elem : arr) {
            maxEle = Math.max(maxEle, elem);
        }
        return maxEle;
    }

    public static int minimum(int[] arr) {
        int minEle = (int) 1e9;
        for (int elem : arr) {
            minEle = Math.min(elem, minEle);
        }
        return minEle;
    }

    public static int find(int[] arr, int data) {
        int foundAtIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (data == arr[i]) {
                foundAtIndex = i;
            }
        }
        return foundAtIndex;
    }

    public static int spanOfArray1 (int[] arr) {
        int minElem = minimum(arr);
        int maxEle = maximum(arr);

        return maxEle - minElem;
    }

    public static int spanOfArray2(int[] arr) {
        int minEle = (int) 1e9;
        int maxEle = -(int) 1e9;

        for (int elem : arr) {
            minEle = Math.min(minEle, elem);
            maxEle = Math.max(maxEle, elem);
        }
        int span = maxEle - minEle;
        return span;
    }

    public static int[] reverseOfArray(int[] arr) {
        // no extra space
        // no strings
        // no standard liberaries
        // within the time complexity of O(n)
    }

    public static void main(String[] args) {
        System.out.println(spanOfArray(input1(scn.nextInt())));
    }
}