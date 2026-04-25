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
            for(int cst = 1; cst <= nst; cst++) {
                System.out.print("* \t");
            }
            nst++;
            System.out.println();
        }
    }
   
    public static void mirrorRightTri(int n) {

    }
    public static void main(String[] args) {
        rightTri(scn.nextInt());
    }
}
