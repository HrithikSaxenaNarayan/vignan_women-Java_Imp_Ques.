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

    }
    
    public static int minimum(int[][] arr) {

    }

    public static int find(int[][] arr, int data) {

    }

    public static int span(int[][] arr) {

    }
    public static void main(String[] args){
        display(input(scn.nextInt(), scn.nextInt()));

    }
}