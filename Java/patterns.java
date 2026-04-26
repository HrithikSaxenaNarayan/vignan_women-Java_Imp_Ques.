import java.util.*;

public class patterns {
    public static Scanner scn = new Scanner(System.in);

    public static void square(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* \t");
            }
            System.out.println();
        }
    }

    public static void rightTri(int n) {
        int nst = 1;
        for (int row = 1; row <= n; row++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("* \t");
            }
            nst++;
            System.out.println();
        }
    }

    public static void mirrorRightTri(int n) {
        int nsp = n - 1;
        int nst = 1;
        for (int row = 1; row <= n; row++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }

            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            nsp--;
            nst++;
            System.out.println();
        }
    }

    public static void reverseTri(int n) {
        int nst = n;
        int nsp = 0;

        for (int row = 1; row <= n; row++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            nst--;
            nsp++;
            System.out.println();
        }
    }

    
    public static void cross(int n) {
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == j) || (i + j == n + 1)) {
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void numTri1(int n) {

    }

    public static void numTri2(int n) {

    }

    public static void numTri3(int n) {

    }

    public static void diamondOfSpaces(int n) {

    }
    
    public static void main(String[] args) {
        cross(scn.nextInt());
    }
}
