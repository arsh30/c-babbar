package l003_Arrays;

import java.util.Scanner;

public class l001 {

  public static Scanner scn = new Scanner(System.in);

  //    how to display in Array
  public static void display2(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  // how to declare
  public static void test1() {
    int n = scn.nextInt();
    int[] arr = new int[n]; // user dependent array

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    display2(arr);
  }

  //   ques 1
  public static int maximum(int[] arr) {
    int maxEle = -(int) 1e9;
    for (int ele : arr) {
      if (ele > maxEle) {
        maxEle = ele;
      }
    }
    return maxEle;
  }

  public static int maximum_2(int[] arr) {
    if (arr.length == 0) {
      return -(int) 1e9;
    }
    int maxEle = arr[0];
    // note: agr hum aise koi condition lgaege ki arr[0] means for loop ke bhar
    //   to extra check lgaege ki agr array empty hoya to
    for (int ele : arr) {
      if (ele > maxEle) {
        maxEle = ele;
      }
    }
    return maxEle;
  }

  //   ques 2
  public static int minimum(int[] arr) {
    int minEle = (int) 1e9;
    for (int ele : arr) {
      if (ele < minEle) {
        minEle = ele;
      }
    }
    return minEle;
  }

  //   ques3
  public static boolean findData(int[] arr, int data) {
    for (int ele : arr) {
      if (ele == data) {
        return true;
      }
    }
    return false;
  }

  //ques 5
  public static void spanOfArray(int[] arr) {
    int max = maximum(arr);
    int min = minimum(arr);
    int span = max - min;
    System.out.println(span);
  }

  //   ques 6
  //   sum of two arrays -> ik array return krna hai so return type bhi ik array hoga
  // agr return type void rakhege to hame parameter me paas krna hoga

  public static void sumOfTwoArrays(int[] a, int[] b) {
    int n = a.length, m = b.length;
    int[] ans = new int[Math.max(n, m) + 1];

    int i = n - 1, j = m - 1, k = ans.length - 1;
    int carry = 0;

    while (k >= 0) {
      // int sum = a1[i] + a2[j] + carry; handle this case
      int sum = carry;
      if (i >= 0) {
        sum += a[i];
      }
      if (j >= 0) {
        sum += b[j];
      }

      int q = sum / 10;
      int r = sum % 10;

      ans[k] = r;
      carry = q;

      i--;
      j--;
      k--;
    }

    for (int l = 0; l < ans.length; l++) {
      if (l == 0 && ans[l] == 0) continue; // means next iteration
      System.out.println(ans[l]);
    }
  }

  //Main ques 7
  public static void diffOfTwoArrays(int[] a, int[] b) {
    int n = a.length, m = b.length;
    int[] ans = new int[Math.max(n, m)];

    int i = n - 1, j = m - 1, k = ans.length - 1;
    int borrow = 0;

    // constraint - b2 is always larger tan b so subtract b from a
    while (k >= 0) {
      int diff = borrow + (j >= 0 ? b[j] : 0) - (i >= 0 ? a[i] : 0);
      i--;
      j--;

      if (diff < 0) {
        diff += 10;
        borrow = -1;
      } else {
        borrow = 0;
      }

      ans[k--] = diff;
    }

    // handle case agar starting me 0 hoye toh like 000001000

    boolean is_You_find_Non_zero_Number = false;
    for (int l = 0; l < ans.length; l++) {
      if (!is_You_find_Non_zero_Number && ans[l] == 0) continue;
      is_You_find_Non_zero_Number = true;
      System.out.println(ans[l]);
    }
  }

  public static void input(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }
  }

  // ques 8
  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void reverseArray(int[] arr) {
    int i = 0, j = arr.length - 1;
    while (i < j) {
      swap(arr, i, j);
      i++;
      j--;
    }
  }

  // ques 9
  public static void swap_for_rotate(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void reverse(int[] arr, int si, int ei) {
    while (si < ei) {
      swap_for_rotate(arr, si, ei);
      si++;
      ei--;
    }
  }

  public static void rotateAnArray(int[] arr, int k) {
    // -> logic -> reverse 3 times
    int n = arr.length;
    k = k % n;

    if (k < 0) k = k + n;

    reverse(arr, 0, n - 1);
    reverse(arr, 0, k - 1);
    reverse(arr, k, n - 1);
  }

  //ques 10
  public static int[] inverse(int[] arr) {
    int[] invArr = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      int pos = arr[i]; // 4
      invArr[pos] = i;
    }
    return invArr;
  }

  // ques 11
  public static int maximum_barChart(int[] arr) {
    int maxEle = -(int) 1e9;
    for (int ele : arr) {
      if (ele > maxEle) {
        maxEle = ele;
      }
    }
    return maxEle;
  }

  public static void barChart(int[] arr) {
    int maxLengthofBarChart = maximum(arr);

    for (int i = maxLengthofBarChart; i >= 1; i--) {
      for (int j = 0; j < arr.length; j++) {
        if (arr[j] >= i) {
          System.out.print("*\t");
        } else {
          System.out.print("\t");
        }
      }
      System.out.println();
    }
  }

  //ques 12
  // sp - starting point ep - ending point
  public static void subArrayProblem(int[] arr) {
    for (int sp = 0; sp < arr.length; sp++) {
      for (int ep = sp; ep < arr.length; ep++) {
        for (int i = sp; i <= ep; i++) {
          System.out.print(arr[i] + "\t");
        }
        System.out.println();
      }
    }
  }

  // ques 13 - extra ques
  public static int[] prefixSumArray(int[] arr) {
    int[] prefixsumArr = new int[arr.length + 1];
    for (int i = 0; i < arr.length; i++) {
      prefixsumArr[i + 1] = prefixsumArr[i] + arr[i];
    }
    return prefixsumArr;
  }

  public static void resolveQuery() {
    // 1st make arra
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    // bring our psum Array
    int[] psum = prefixSumArray(arr);

    // eg: suppose we have 10 query
    int q = scn.nextInt();

    while (q-- > 0) {
      // Enter the range of the queries
      int si = scn.nextInt();
      int ei = scn.nextInt();

      System.out.println(psum[ei + 1] - psum[si]);
    }
  }

  // FINISH :)

  public static void main(String[] args) {
    test1();
    int n = scn.nextInt();
    int[] a = new int[n];
    input(a);

    int m = scn.nextInt();
    int[] b = new int[m];
    input(b);
    // subtractTwoArrays(a, b);
  }
}
//   Note -> In Every ques of Array ques
//   1st we have to take the input in an array so we use loop
//   2nd -> we have to use the loop to prnt the element in an array
//
