import java.util.Scanner;
public class lec1{
    public static Scanner scn = new Scanner(System.in);
    
    //function defination
    public static void fibo (int n){
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }

    public static boolean isPrime(int n) {
        boolean res = false;
        for (int i = 2; i <= n/2; i++) {
            if (n % i != 0) {
                res = true;
            }
            else {
                res = false;
            }
        }
        
        return res;
    }

    public static void primeNum(int n) {
        boolean res = isPrime(n);
        if (res == true) {
            System.out.println("Yes this is a prime number");
        }
        else {
            System.out.println("No this is not a prime number");
        }

    }
    
    public static void reverseNum(int n) {
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            System.out.println(rem);
        }
    }

    public static void forwardOrderNum(int n){ 
        
    }
    public static void main(String[] args){
        reverseNum(scn.nextInt()); // function calling
    }
}