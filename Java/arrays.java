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
        int maxEle = -(int)1e9;
        for(int elem : arr){
            maxEle = Math.max(maxEle, elem);
        }
        return maxEle;
    }
   
    public static void main(String[] args) {
        // display1(input1(scn.nextInt()));
        System.out.println(maximum(input1(scn.nextInt())));
    }
}