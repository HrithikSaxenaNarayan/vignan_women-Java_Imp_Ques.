import java.util.*;
public class twoDarrays{
    public static Scanner scn = new Scanner(System.in);

    public static int[][] input(int n, int m){
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        return arr;
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int maximum(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        int maxEle = -(int)1e9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maxEle = Math.max(maxEle, arr[i][j]);
            }
        }
        return maxEle;
    }
    
    public static int minimum(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        int minEle = (int)1e9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                minEle = Math.min(minEle, arr[i][j]);
            }
        }
        return minEle;

    }

    // public static boolean find(int[][] arr, int data) {

    // }

    // public static int span(int[][] arr) {

    // }
    public static void main(String[] args){
        System.out.println(minimum(input(scn.nextInt(), scn.nextInt())));
    }
}