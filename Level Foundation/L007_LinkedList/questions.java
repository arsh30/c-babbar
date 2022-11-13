public class questions {

  public class Node {

    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  static Node head = null;
  static Node tail = null;

  //Note: byefault Only head is given in the ques
  public int mid() {
    Node slow = head;
    Node fast = head;

    //   while(fast != null && fast.next != null){ it gives 2nd mid of even length linkedlist
    while (fast.next != null && fast.next.next != null) { // it gives 1st mid of even length linked list
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow.data;
  }

  //Note: ki agr koi kisi cheez me attach krna hai to vo left side me likhte hai
  //   public void reverseLLPointerItr(Node head) { // ye parameter wala remove krdiya because global variable leliya
  public void reverseLLPointerItr(Node head) {
    Node curr = head;
    Node prev = null;

    while (curr != null) {
      Node forw = curr.next;
      curr.next = prev;

      prev = curr;
      curr = forw;
    }

    tail = head;
    head = prev;
  }

  public Node getNodeAt(int idx) {
    Node curr = head;
    while (idx-- > 0) {
      curr = curr.next;
    }
    return curr;
  }

  public int size() {
    int length = 0;
    Node curr = head;
    while (curr != null) {
      curr = curr.next;
      length++;
    }
    return length;
  }

  public void reverseLLDataIterative(Node head) {
    int i = 0;
    int j = size() - 1;
    while (i < j) {
      Node in = getNodeAt(i); // somehow humko node aajega 1st or last wala
      Node jn = getNodeAt(j);

      int temp = in.data;
      in.data = jn.data;
      jn.data = temp;

      i++;
      j--;
    }
  }

  public void displayReverseHelper_Recursive(Node node) {
    if (node == null) return;

    displayReverseHelper_Recursive(node.next); // means 2 se 7 tak recursive call lgayi
    System.out.print(node.data + " ");
  }

  // ques 5
  public static void reversePRhelper(Node node) {
    if (node.next == null) {
      Node temp = head;
      head = tail;
      tail = temp;
      return;
    }

    reversePRhelper(node.next); // faith -> 1 to end tak reverse hjegi

    Node forw = node.next;
    forw.next = node;
  }

  public static void reversePR2() {
    reversePRhelper(head);
    tail.next = null;
  }

  // Method 2: return type
  public static Node reversePRhelper2(Node node) {
    if (node.next == null) {
      Node temp = head;
      head = tail;
      tail = temp;

      return node;
    }

    Node rNode = reversePRhelper2(node.next); // faith -> 1 to end tak reverse hjegi

    rNode.next = node;
    node.next = null;

    return node;
  }

  public static void reversePR() {
    reversePRhelper(head);
  }

  // ques 6 -> 1st way is using getNodAt => idx = (size - 1 - k)

  public static int removeKfromEndOfLL(int k) {
    //Gap way
    Node slow = head;
    Node fast = head;

    while (k-- > 0) {
      fast = fast.next;
    }

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next;
    }

    return slow.data;
  }
}
