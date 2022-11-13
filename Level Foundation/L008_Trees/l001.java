// Binary tree have: Atmax 2 child, 0,1,2 possible only
import java.util.ArrayList;

public class l001 {

  public static class Node {

    int data = 0;
    Node left = null;
    Node right = null;

    Node(int data) {
      this.data = data;
    }
  }

  public static void preOrderTraversal(Node root, ArrayList<Integer> ans) {
    if (root == null) return;

    ans.add(root.data);
    preOrderTraversal(root.left, ans);
    preOrderTraversal(root.right, ans);
  }

  public static void inOrderTraversal(Node root, ArrayList<Integer> ans) {
    if (root == null) return;

    inOrderTraversal(root.left, ans);
    ans.add(root.data);
    inOrderTraversal(root.right, ans);
  }

  public static void postOrderTraversal(Node root, ArrayList<Integer> ans) {
    if (root == null) return;

    postOrderTraversal(root.left, ans);
    postOrderTraversal(root.right, ans);
    ans.add(root.data);
  }

  public static void traversal(Node root) {
    ArrayList<Integer> ans = new ArrayList<>();
    preOrderTraversal(root, ans);
    // inOrderTraversal(root, ans);
    // postOrderTraversal(root, ans);
  }

  //   ========================================
  //   Basic Functions  -> Every ds Have these fn
  //   ========================================
  public static int size(Node root) {
    if (root == null) return 0;

    int left = size(root.left);
    int right = size(root.right);

    return left + right + 1;
  }

  //  Bydefault term of Edge
  public static int height(Node root) {
    if (root == null) return -1;

    int left = height(root.left);
    int right = height(root.right);

    return Math.max(left, right) + 1;
  }

  public static int heightInTermOfNode(Node root) {
    if (root == null) return 0;

    int left = height(root.left);
    int right = height(root.right);

    return Math.max(left, right) + 1;
  }

  public static int maximum(Node root) {
    if (root == null) return -(int) 1e9;

    int leftMax = maximum(root.left);
    int rightMax = maximum(root.right);

    return Math.max(Math.max(leftMax, rightMax), root.data);
  }

  public static int minimum(Node root) {
    if (root == null) return (int) 1e9;

    int leftMin = minimum(root.left);
    int rightMin = minimum(root.right);

    return Math.min(Math.min(leftMin, rightMin), root.data);
  }

  public static int sumOfTree(Node root) {
    if (root == null) return 0;

    int leftSum = sumOfTree(root.left);
    int rightSum = sumOfTree(root.right);
    return leftSum + rightSum + root.data;
  }

  public static boolean findData(Node root, int data) {
    if (root == null) return false;

    boolean res = root.data == data;

    return res || findData(root.left, data) || findData(root.right, data);
  }

  public static boolean findData2(Node root, int data) {
    if (root == null) return false;

    if (root.data == data) return true;

    boolean left = findData2(root.left, data);
    if (left) return true;

    boolean right = findData2(root.right, data);
    if (right) return true;

    return false; // Kuch bhi return kr skte hai
  }
}
