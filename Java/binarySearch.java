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
            } else if (data < arr[mid]) {
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }
        return -1;
    }

    public static int frstIdx(int[] arr, int data) {
        int si = 0;
        int ei = arr.length - 1;
        while (si <= ei) {
            int mid = ((si + ei) / 2);
            if (arr[mid] == data) {
                if (mid - 1 >= 0 && arr[mid - 1] == data) {
                    ei = mid - 1;
                } else {
                    return mid;
                }

            } else if (arr[mid] < data) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        return -1;
    }

    public static int lastIdx(int[] arr, int data) {
        int si = 0;
        int ei = arr.length - 1;
        while (si <= ei) {
            int mid = ((si + ei) / 2);
            if (arr[mid] == data) {
                if (mid + 1 < arr.length && arr[mid + 1] == data) {
                    si = mid + 1;
                } else {
                    return mid;
                }

            } else if (arr[mid] < data) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        return -1;
    }

    public static int firstAndLastIdx(int[] arr) {

    }
    public static void main(String[] args) {
        System.out.println(lastIdx(input1(scn.nextInt()), scn.nextInt()));
    }
}


// git add . && git commit -m "update" && git push

//