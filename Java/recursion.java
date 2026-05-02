import java.util.*;
public class recursion{
    public static Scanner scn = new Scanner(System.in);

    public static void recursionSequence0ToN(int n, int i) {
        if(i >= n) {
            return;
        }
        recursionSequence0ToN(n, i+1);
        System.out.println(i);
    }
    public static void main(String[] args){
        recursionSequence0ToN(scn.nextInt(), scn.nextInt());
    }
}


// 1) fibo
// 2) factorial
// 3) sum of digits
// 4) reverse number/array
// 5) binary search