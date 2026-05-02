import java.util.*;

public class binarySearch {
    public static Scanner scn = new Scanner(System.in);

    public static int[] input1(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    // arr = [9 12 18 18 18 18 18 18 28 31 45 56 83 92 96 100]; data= 18

    public static int searchData(int[] arr, int data) {
        int si = 0, ei = arr.length - 1;
        
        while (si <= ei) {
            int mid = ((ei + si) / 2);
            if (arr[mid] == data) {
                return mid;
            }
            else if (data < arr[mid]) {
                ei = mid - 1 ;
            }
            else {
                si = mid + 1;
            }
        }
        return -1;
    }

    
    public static void main(String[] args) {
        System.out.println(searchData(input1(scn.nextInt()), scn.nextInt()));
    }
}

//