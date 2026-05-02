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
            System.out.print(arr[i] + " ");
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

    public static int spanOfArray1(int[] arr) {
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

    public static void swapfn(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] reverseOfArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            swapfn(arr, i, j);
            i++;
            j--;
        }
        return arr;
    }

    public static int[] inverseArray(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[arr[i]] = i;
        }
        return ans;
    }

    public static int[] rotateArray(int[] arr, int r) {
        int n = arr.length;
        int[] ans = new int[n];

        r %= n;

        if (r < 0) {
            r += n;
        }

        for (int i = 0; i < n; i++) {
            int idx = (i + r) % n;
            ans[idx] = arr[i];
        }
        return ans;
    }

    public static void additionArray(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int ansLen = Math.max(n, m) + 1;
        int[] ans = new int[ansLen];
        int i = n - 1, j = m - 1, k = ansLen - 1, carry = 0;

        while (k >= 0) {
            int sum = carry + ((i >= 0) ? arr1[i] : 0) + ((j >= 0) ? arr2[j] : 0);
            carry = sum / 10;
            ans[k] = sum % 10;

            i--;
            j--;
            k--;
        }

        for (int idx = 0; idx < ansLen; idx++) {
            if (idx == 0 && ans[idx] == 0) {
                continue;
            }
            System.out.print(ans[idx] + " ");
        }
    }

    public static void subtractionArray(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int ansLen = Math.max(n, m);
        int[] ans = new int[ansLen];
        int i = n - 1, j = m - 1, k = ansLen - 1, borrow = 0;

        while (k >= 0) {
            int diff = borrow + ((i >= 0) ? arr1[i] : 0) - ((j >= 0) ? arr2[j] : 0);

            if (diff < 0) {
                borrow = -1;
                diff += 10;
            } else {
                borrow = 0;
            }

            ans[k] = diff;

            i--;
            j--;
            k--;
        }

        boolean nonZeros = false;
        for (int elem : ans) {
            if (elem != 0) {
                nonZeros = true;
            }
            if (nonZeros) {
                System.out.print(elem + " ");
            }
        }
    }

    public static void main(String[] args) {
        subtractionArray(input1(scn.nextInt()), input1(scn.nextInt()));
    }
}