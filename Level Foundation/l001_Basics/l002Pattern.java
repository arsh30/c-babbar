package l001_Basics;

import java.util.Scanner;

public class l002Pattern {

  public static Scanner scn = new Scanner(System.in);

  //pattern 3
  public static void mirrorTriangle(int row) {
    int nsp = row - 1;
    int nst = 1;
    for (int r = 1; r <= row; r++) {
      for (int csp = 1; csp <= nsp; csp++) {
        System.out.print(" ");
      }
      for (int cst = 1; cst <= nst; cst++) {
        System.out.print("*");
      }
      nst++;
      nsp--;

      System.out.println();
    }
  }

  //pattern 1
  public static void triangle(int row) {
    int nst = 1;
    int nsp = 0;

    for (int r = 1; r <= row; r++) {
      for (int csp = 1; csp <= nsp; csp++) {
        System.out.print("\t");
      }
      for (int cst = 1; cst <= nst; cst++) {
        System.out.print("*\t");
      }
      nst++;
      System.out.println();
    }
  }

  //    pattern 2
  public static void pattern2(int row) {
    int nst = row;
    int nsp = 0;

    for (int r = 1; r <= row; r++) {
      for (int cst = 1; cst <= nst; cst++) {
        System.out.print("*\t");
      }
      for (int csp = 1; csp <= nsp; csp++) {
        System.out.print("\t");
      }
      nst--;
      nsp++;
      System.out.println();
    }
  }

  //    pattern4
  public static void pattern4(int row) {
    int nst = row, nsp = 0;
    for (int r = 1; r <= row; r++) {
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

  //    pattern7
  public static void pattern7(int row) {
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= row; j++) {
        if (i == j) {
          System.out.print("*\t");
        } else System.out.print("\t");
      }
      System.out.println();
    }
  }

  //   pattern 8
  public static void pattern8(int row) {
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= row; j++) {
        if (i + j == row + 1) {
          System.out.print("*\t");
        } else System.out.print("\t");
      }
      System.out.println();
    }
  }

  //   pattern 9
  public static void pattern9(int row) {
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= row; j++) {
        if (i + j == row + 1 || i == j) {
          System.out.print("*\t");
        } else System.out.print("\t");
      }
      System.out.println();
    }
  }

  //   extra ques
  public static void pattern9A(int row) {}

  public static void main(String[] args) {
    int n = scn.nextInt();
    // mirrorTriangle(n);
    // // triangle(n);
    // pattern2(n);

    pattern4(n);
  }
}
