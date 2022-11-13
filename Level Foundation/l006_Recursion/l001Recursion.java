// import java.util.Scanner;

// public class l001Recursion {

//   public static Scanner scn = new Scanner(System.in);

//   public static void printIncreasing(int a, int b) {
//       if (a + 1 > b) {
//           return;
//       }
//         System.out.println("hi" + a);
//         printIncreasing(a + 1, b);
//         System.out.println("Bye" + a);
//     }

//   public static void fun(int a) {
//     a = a + 1; // kya iss 'a' ke increase hone se niche wale function ko koi asar hoega. No because local variable hai
//     //   aisa kese ho skta hai upr increase krdiya a or niche increase ni hori name to same hai
//     // reason jo stack hai vo har function ko alag tarike se dekhta hai
//     //   jese jese stack me upr jate rhege har function ko alag way se dekhege like main.fn1() and main.fn1.fun() and so on...
//     // Every function is different

//     // Note: agr fn ka name same hai to yeh mat smjho ki vo fn apne aap ko call krra hai
//     // har fn jo hai vo different hai ik dusre se ye assume krege kisi variable ke change hone se niche wale ko koi asar nhi pdhega

//   }

//   public static void fun1() {
//     int a = 1;
//     fun(a);
//     System.out.println(a);
//   }

//   public static void main(String[] args) {
//       // fun1(); //Normal code start from main
//     printIncreasing(1, 5);
//   }
// }
