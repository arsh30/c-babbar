package l001_Basics;

import java.util.Scanner;

public class l001Basics {

  public static Scanner scn = new Scanner(System.in);

  //  Dec 22 -> Functions

  public static int multiply(int a, int b) {
    return a * b;
  }

  public static void add(int a, int b) {
    System.out.println(a + b);
  }

  public static int subtract(int a, int b) {
    return a - b;
  }

  public static int divide(int a, int b) {
    return a / b;
  }

  //Portal ques start

  // ques 1
  public static void printZ() {
    System.out.println("*****");
    System.out.println("   *");
    System.out.println("  *");
    System.out.println(" *");
    System.out.println("*****");
  }

  // ques 2
  public static void gradingSystem(int marks) {
    if (marks > 90) {
      System.out.println("excellent");
    } else if (marks > 80 && marks <= 90) {
      System.out.println("good");
    } else if (marks > 70 && marks <= 80) {
      System.out.println("fair");
    } else if (marks > 60 && marks <= 70) {
      System.out.println("meets expectations");
    } else {
      System.out.println("below par");
    }
  }

  //  dec 23

  //  ques1
  public static void printNTime(int n) {
    for (int i = 0; i <= n; i++) {
      System.out.println("Hello printing N times loop");
    }
  }

  //  ques2
  public static void printTableOfN(int n) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(n + " X " + i + " = " + n * i);
    }
  }

  public static int countDigit(int n) {
    int nod = 0;
    int num = n;
    while (num != 0) {
      num /= 10;
      nod++;
    }
    return nod;
  }

  public static void print_LineWise_DigitOfNumber(int n) {
    int num = n;
    int nod = countDigit(num);

    int div = 1;
    while (nod-- > 1) {
      // set the divisor
      div *= 10;
    }

    while (div != 0) {
      int q = n / div;
      int rem = n % div;

      System.out.println(q);
      n = rem;

      //set the divisor
      div /= 10;
    }
  }

  // ques 7 reverse a number
  public static void printInReverseOrder(int n) {
    int num = n;
    while (num != 0) {
      int lastDigit = n % 10;
      System.out.println(lastDigit);
    }
  }

  //ques 8 -> reverseOrder
  public static int reverseOrder(int n) {
    int num = n;
    int ans = 0;

    while (num != 0) {
      int lastDigit = num % 10;
      num /= 10;
      ans = ans * 10 + lastDigit;
    }
    return ans;
  }

  //ques 9 -> rotate a number
  public static void rotateNumber(int n, int k) {
    int nod = 0;
    int num = n;
    while (num != 0) {
      num /= 10;
      nod++;
    }

    //Handle very large case
    // Numbers are repeating after nod, so we are module to get
    // the number within the range

    k = k % nod;

    // Handle Negative case
    // means jo last digits hai unko hi aage le aaye
    if (k < 0) {
      k = k + nod;
    }

    int div = (int) Math.pow(10, k);
    int mult = (int) Math.pow(10, nod - k);

    int q = n / div;
    int rem = n % div;

    int ans = (rem * mult) + q;

    System.out.println(ans);
  }

  public static void inverseNumber(int n) {
    /*
    Counter = 1 number h vo konsi position pr jana chaiye uspr bhjege ie counter * 10 ^ rem - 1;
    */
    int num = n;
    int counter = 1; // this indicates the position
    int ans = 0;
    while (num != 0) { // travel from right to left
      int rem = num % 10;
      num /= 10;
      ans += counter * Math.pow(10, rem - 1);
      counter++;
    }
    System.out.println(ans);
  }

  public static void main(String[] args) {
    // System.out.println("hello");
    // System.out.println("world");
    // int a = scn.nextInt();
    // int b = scn.nextInt();

    // add(a, b);
    // System.out.println(multiply(a, b));
    // System.out.println(subtract(a, b));
    // System.out.println(divide(a, b));

    int n = scn.nextInt();
    // printNTime(n);
    printTableOfN(n);
  }
}
