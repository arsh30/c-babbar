// Theory
/*
 *
 *
 */

public class l001 {

  public static boolean isPalindrome(String str) {
    // check string is palindrome or not
    // abc cba means aisi string jo fold ho ske
    int i = 0;
    int j = str.length() - 1;

    while (i < j) {
      if (str.charAt(i) != str.charAt(j)) {
        i++;
        j--;
        return false;
      }
    }
    return true;
  }

  //   ques 2
  public static void getAllSubstrings(String str) {
    // Eg: substring is continous, eg abcd
    // so subtring are  a, ab , abc , abcd, b, bc , bcd, c, cd , d
    for (int i = 0; i < str.length(); i++) {
      // now loop for substring
      for (int len = 1; i + len <= str.length(); len++) {
        System.out.println(str.substring(i, i + len)); // si, si + len
      }
    }
  }

  //   ques 3
  public static void getAllPalindromicSubstrings(String str) {
      for (int i = 0; i < str.length(); i++) {
          for (int len = 1; i + len <= str.length(); len++) {
              String s = str.substring(i, i + len);
              if (isPalindrome(s)) {
                  System.out.println(s);
              }
          }
      }
  }
  
  //   ques 5
  public static String StringCompression(String str) {
    if(str.length <= 1){ //yeh case tb lgate hai jb 0 index wala har code se use krte hai
        return str;
    }
     
    StringBuilder sb = new StringBuilder();
    sb.append(str.charAt(0));

    for (int i = 1; i <= str.length(); i++) {
        int count = 1; // because baar baar 1 set krna hai isliye andr liya
        while(i < str.length() && str.charAt(i - 1) == st.charAt(i)) {
            count++;
            i++;
        }
        if(count!= -1) sb.append(count);
        if(i < str.length()) sb.append(str.charAt(i));
    }
    return sb.toString();

}

  public static void main(String[] args) {


    
  }
}


















