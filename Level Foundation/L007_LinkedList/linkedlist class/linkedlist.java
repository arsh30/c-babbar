public class linkedlist {

  private class Node {

    int data = 0;
    Node next = null;

    Node(int data) {
      this.data = data;
    }
  }

  // This is Private because hame jo class milti usme head,tail direct access krne ko kabhi nhi milta
  //   Linked list class ke through hi access krte hai
  private Node head = null;
  private Node tail = null;
  private int sizeOfLL = 0;

  //   Basic Functions
  public boolean isEmpty() {
    return this.sizeOfLL == 0;
  }

  public int size() {
    return this.sizeOfLL;
  }

  public void display() {
    Node curr = this.head;
    while (curr != null) {
      System.out.print(curr.data + " -> ");
      curr = curr.next;
    }
  }

  //   Exceptions
  public void EmptyException() throws Exception {
    if (this.sizeOfLL == 0) {
      throw new Exception("Linked List is Empty!: -1");
    }
  }

  public void IndexOutOfBoundSizeExclusive(int idx) throws Exception {
    if (idx < 0 || idx >= this.sizeOfLL) {
      throw new Exception("Index Out of Bound Exception:-1");
    }
  }

  public void IndexOutOfBoundSizeInclusive(int idx) throws Exception {
    if (idx < 0 || idx > sizeOfLL) {
      throw new Exception("Index Out Of Bound: -1");
    }
  }

  //   Add ======================================================================
  private void addFirstNode(Node node) {
    if (this.head == null) {
      this.head = node;
      this.tail = node;
    } else {
      node.next = this.head;
      this.head = node;
    }
    this.sizeOfLL++;
  }

  public void addFirst(int data) {
    // 1st Think About any Exception can come
    Node node = new Node(data);
    addFirstNode(node);
  }

  private void addLastNode(Node node) {
    if (this.head == null) {
      this.head = node;
      this.tail = node;
    } else {
      this.tail.next = node;
      this.tail = node;
    }
    this.sizeOfLL++;
  }

  public void addLast(int data) {
    Node node = new Node(data);
    addLastNode(node);
  }

  //time complexity -> O(n) due to shifting
  private void addNodeAt(int idx, Node node) {
    if (idx == 0) addFirstNode(node); else if (
      idx == this.sizeOfLL
    ) addLastNode(node); else { // means tail par add krne ko bolra hai
      Node prev = getNodeAt(idx - 1);
      Node forw = prev.next;

      prev.next = node;
      node.next = forw;
      this.sizeOfLL++;
    }
  }

  public void addAt(int idx, int data) throws Exception {
    IndexOutOfBoundSizeInclusive(idx);
    Node node = new Node(data);
    addNodeAt(idx, node);
  }

  //   remove ======================================================================

  private Node removeFirstNode() {
    Node removeNode = this.head;
    if (this.sizeOfLL == 1) {
      this.head = null;
      this.tail = null;
    } else {
      Node forw = this.head.next;
      removeNode.next = null;
      this.head = forw;
    }
    this.sizeOfLL--;
    return removeNode;
  }

  public int removeFirst() throws Exception {
    // 1st think about exception
    EmptyException();
    Node node = removeFirstNode();
    return node.data;
  }

  private Node removeLastNode() {
    Node removeNnode = this.tail;
    if (this.sizeOfLL == 1) {
      this.head = null;
      this.tail = null;
    } else {
      Node secondLastNode = getNodeAt(this.sizeOfLL - 2);
      this.tail = secondLastNode;
      this.tail.next = null;
    }
    this.sizeOfLL--;
    return removeNnode;
  }

  public int removeLast() throws Exception {
    EmptyException();
    Node rNode = removeLastNode();
    return rNode.data;
  }

  private Node removeNodeAt(int idx) {
    if (idx == 1) {
      return removeFirstNode();
    } else if (idx == this.sizeOfLL - 1) {
      return removeLastNode();
      // eg: 8 length linked list and remove 7th index
    } else {
      Node prev = getNodeAt(idx - 1);
      Node curr = prev.next;
      Node forw = curr.next;

      prev.next = forw;
      curr.next = null;

      this.sizeOfLL--;
      return curr;
    }
  }

  public int removeAt(int idx) throws Exception {
    EmptyException();
    IndexOutOfBoundSizeExclusive(idx);
    Node node = removeNodeAt(idx);
    return node.data;
  }

  //   get =========================================================================
  public int getFirst() throws Exception {
    EmptyException();
    return this.head.data;
  }

  public int getLast() throws Exception {
    EmptyException();
    return this.tail.data;
  }

  private Node getNodeAt(int idx) {
    Node curr = this.head;
    while (idx-- > 0) {
      curr = curr.next;
    }
    return curr;
  }

  public int getAt(int idx) throws Exception {
    IndexOutOfBoundSizeExclusive(idx);
    Node node = getNodeAt(idx);
    return node.data;
  }
}
