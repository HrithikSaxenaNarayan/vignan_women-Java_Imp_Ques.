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

    public static void stateOfWakanda2(int[][] arr) {
        int n = arr.length, m = arr[0].length;

        for(int col = 0; col < m; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < n; row++) {
                    System.out.print(arr[row][col] + " ");
                }
            }
            else {
                for (int row = n-1; row >= 0; row--) {
                    System.out.print(arr[row][col] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void stateOfWakandaHalfDiagonal(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        for (int gap = 0; gap < m; gap++) {
            for (int i = 0, j = gap; i < n && j < m; i++, j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void stateOfWakandaSpiral (int[][] arr) {
        int n = arr.length, m = arr[0].length, tnel = n * m;
        int rmin = 0, rmax = n - 1;
        int cmin = 0, cmax = m-1;

        while(tnel >= 0) {
            for (int row = rmin; row <= rmax && tnel > 0; row++) {
                System.out.print(arr[row][cmin] + " ");
                tnel--;
            }
            cmin++;
            System.out.println();

            for (int col = cmin; col <= cmax && tnel > 0; col++) {
                System.out.print(arr[rmax][col] + " ");
                tnel--;
            }
            rmax--;
            System.out.println();

            for (int row = rmax; row >= rmin && tnel > 0; row--) {
                System.out.print(arr[row][cmax] + " ");
                tnel--;
            }
            cmax--;
            System.out.println(); 

            for (int col = cmax; col >= cmin && tnel > 0; col--) {
                System.out.print(arr[rmin][col] + " ");
                tnel--;
            }
            rmin++;
            System.out.println();
        }
    }


    public static void main(String[] args){
        stateOfWakandaSpiral(input(scn.nextInt(), scn.nextInt()));
    }
}