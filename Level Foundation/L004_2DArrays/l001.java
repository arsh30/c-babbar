package L004_2DArrays;

import java.util.Scanner;

public class l001 {

  public static Scanner scn = new Scanner(System.in);

  public static void input(int[][] arr) {
    int n = arr.length;
    int m = arr[0].length;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = scn.nextInt();
      }
    }
  }

  public static void display(int[][] arr) {
    int n = arr.length;
    int m = arr[0].length;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void display_2(int[][] arr) {
    for (int[] ele : arr) {
      for (int e : ele) {
        System.out.print(e + " ");
      }
      System.out.println();
    }
  }

  //ques 1
  public static boolean findEle(int[][] arr, int data) {
    int n = arr.length, m = arr[0].length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (arr[i][j] == data) return true;
      }
    }
    return false;
  }

  // ques 2
  public static int maximum(int[][] arr) {
    int n = arr.length, m = arr[0].length;
    int maxEle = -(int) 1e9;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (arr[i][j] > maxEle) maxEle = arr[i][j];
      }
    }
    return maxEle;
  }

  public static int maximum_01(int[][] arr) {
    int maxEle = -(int) 1e9;
    for (int[] ar : arr) {
      for (int e : ar) {
        maxEle = Math.max(maxEle, e);
      }
    }
    return maxEle;
  }

  //ques 3
  public static int minimum(int[][] arr) {
    int n = arr.length, m = arr[0].length;
    int minEle = (int) 1e9;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (arr[i][j] < minEle) minEle = arr[i][j];
      }
    }
    return minEle;
  }

  public static int minimum_01(int[][] arr) {
    int minEle = (int) 1e9;
    for (int[] ar : arr) {
      for (int e : ar) {
        minEle = Math.min(minEle, e);
      }
    }
    return minEle;
  }

  //ques 4
  public static void waveTraversal(int[][] arr) {
    int n = arr.length, m = arr[0].length;
    for (int i = 0; i < n; i++) { // rows loop and column loop is dependent
      if (i % 2 == 0) {
        for (int j = 0; j < m; j++) {
          System.out.print(arr[i][j] + " ");
        }
      } else {
        for (int j = m - 1; j >= 0; j--) {
          System.out.print(arr[i][j] + " ");
        }
      }
    }
  }

  // ques 5
  public static void waveTraversalUpAndDown(int[][] arr) {
    int n = arr.length, m = arr[0].length;
    for (int j = 0; j < m; j++) { // columns loop and rows are varying
      if (j % 2 == 0) {
        for (int i = 0; i < n; i++) {
          System.out.print(arr[i][j] + " ");
        }
      } else {
        for (int i = n - 1; i >= 0; i--) {
          System.out.print(arr[i][j] + " ");
        }
      }
    }
  }

  // ques 6
  public static void diagonalTraversal(int[][] arr) {
    //for diagonal traversal we use " gap strategy " loop always
    int n = arr.length, m = arr[0].length;
    for (int gap = 0; gap < m; gap++) { // gap always for columns length
      for (int i = 0, j = gap; i < n && j < m; i++, j++) {
        System.out.print(arr[i][j] + " ");
      }
    }
  }

  // ques 7
  public static void rotate90(int[][] arr) {
    int n = arr.length, m = arr[0].length;

    // 1. Transpose -> means SWAP rows and Column [move only in upper triangle]
    for (int i = 0; i < n; i++) {
      for (int j = i; j < m; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }

    // 2. Travel on Rows and Swap 1st col vs last column
    for (int i = 0; i < arr.length; i++) {
      int li = 0;
      int ri = arr[i].length - 1;

      while (li < ri) {
        int temp = arr[i][li];
        arr[i][li] = arr[i][ri];
        arr[i][ri] = temp;
        li++;
        ri--;
      }
    }
  }

  // Jan 02 class

  // ques 8
  public static void exitPoint(int[][] arr) {
    int r = 0, c = 0; // initial entry idr se krra hai
    int dir = 0; // 0 -> means right turn, 1 - down, 2 - left, 3 - up

    while (true) {
      // true means infinite time chlega yeh
      // doubt -> aise kr skte ki 0 me forw move krna hai to 0 or 1 ka case lgakr chle,
      //  0 number hai but vo yeh nhi btara ki move kidr krna hai charo dir me

      dir = (dir + arr[r][c]) % 4; // because 4 direction move hore hai

      if (dir == 0) { // right
        // 1. check krege ki safe hai jana
        c++;
        if (c == arr[0].length) { // means break point hoga to pehle print krege
          System.out.println(r);
          System.out.println(c - 1);
          break;
        }
      } else if (dir == 1) { // move down
        r++;
        if (r == arr.length) { // means break point hoga to pehle print krege
          System.out.println(r - 1);
          System.out.println(c);
          break;
        }
      } else if (dir == 2) { // move left
        c--;
        if (c == -1) { // means break point hoga to pehle print krege
          System.out.println(r);
          System.out.println(c + 1);
          break;
        }
      } else { // move up
        r--;
        if (r == -1) { // means break point hoga to pehle print krege
          System.out.println(r + 1);
          System.out.println(c);
          break;
        }
      }
    }
  }

  // ques 9
  public static void spiralDisplay(int[][] arr) {
    int n = arr.length, m = arr[0].length;
    int tne = n * m;

    int rmin = 0, cmin = 0, rmax = n - 1, cmax = m - 1;

    while (tne > 0) {
      for (int i = rmin; i <= rmax && tne > 0; i++) { // tne > 0; because 5 * 3 ke dry run me elem repea hore the
        tne--;
        System.out.println(arr[i][cmin]);
      }
      cmin++; // compress

      for (int i = cmin; i <= cmax && tne > 0; i++) {
        tne--;
        System.out.println(arr[rmax][i]);
      }
      rmax--;

      for (int i = rmax; i >= rmin && tne > 0; i--) {
        tne--;
        System.out.println(arr[i][cmax]); // c max is constant
      }
      cmax--; // ye compress single baar krna isliye loop se bhar likha

      for (int i = cmax; i >= cmin && tne > 0; i--) {
        tne--;
        System.out.println(arr[rmin][i]);
      }
      rmin++;
    }
  }

  // ques 10
  public static void SearchElementIn2d(int[][] arr, int x) {
    int i = 0, j = arr[0].length - 1; // top right corner
    while (i < arr.length && j >= 0) {
      if (x == arr[i][j]) {
        System.out.println(i);
        System.out.println(j);
        return;
      } else if (x < arr[i][j]) {
        j--;
      } else {
        i++;
      }
    }

    System.out.println("Not Found");
  }

  // FINISH 2D ARRAYS

  public static void main(String[] args) {
    int n = scn.nextInt();
    int[][] arr = new int[n][n];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j] = scn.nextInt();
      }
    }

    int x = scn.nextInt(); // search element
    SearchElementIn2d(arr, x);
  }
}
