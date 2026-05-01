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

    public static boolean find(int[][] arr, int data) {
        boolean isData = false;
        int n = arr.length, m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                isData = arr[i][j] == data;
                if (isData) {
                    return isData;
                }
            }
        }
        return isData;
    }

    // public static int span(int[][] arr) {

    // }

    public static void stateOfWakanda1 (int[][] arr) {
        int n = arr.length, m = arr[0].length;

        for(int row = 0; row < n; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < m; col++) {
                    System.out.print(arr[row][col] + " ");
                }
            }
            else {
                for (int col = m-1; col >= 0; col--) {
                    System.out.print(arr[row][col] + " ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        stateOfWakanda(input(scn.nextInt(), scn.nextInt()));
    }
}