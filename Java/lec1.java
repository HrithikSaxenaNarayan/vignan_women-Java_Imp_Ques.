import java.util.Scanner;

public class lec1 {
    public static Scanner scn = new Scanner(System.in);

    // function defination
    public static void fibo(int n) {
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
        for (int i = 2; i <= n / 2; i++) {
            if (n % i != 0) {
                res = true;
            } else {
                res = false;
            }
        }

        return res;
    }

    public static void primeNum(int n) {
        boolean res = isPrime(n);
        if (res == true) {
            System.out.println("Yes this is a prime number");
        } else {
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

    public static int powerFunc(int n) {
        int pow = 1;
        while (n != 0) {
            n /= 10;
            pow *= 10;
        }
        return pow / 10;
    }

    public static void forwardOrderNum(int n) {
        int pow = powerFunc(n);
        while (pow != 0) {
            int res = n / pow;
            n %= pow;
            pow /= 10;
            System.out.println(res);
        }
    }

    public static int counter(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int rotateNum(int n, int rot) {
        int digits = counter(n);
        
        rot = rot % digits;

        if (rot < 0) {
            rot = rot + digits;
        }

        int div = 1;
        int mul = 1;

        for (int i = 0; i < digits; i++) {
            if (i < rot) {
                div = div * 10;
            } else {
                mul = mul * 10;
            }
        }
        int a = n % div;
        int b = n / div;

        return ((a * mul) + b);
    }

    public static void main(String[] args) {
        System.out.println(rotateNum(scn.nextInt(), scn.nextInt())); // function calling
    }
}