public class client {

  public static void main(String[] args) throws Exception {
    linkedlist lla = new linkedlist();
    for (int i = 1; i <= 10; i++) {
      lla.addLast(i * 10);
    }
    lla.addAt(10, 550);
    // System.out.println( lla.getFirst());
    // System.out.println( lla.getLast());
    // System.out.println(lla.getAt(5));

    // System.out.println(lla.removeFirst());
    // System.out.println(lla.removeLast());
    // System.out.println(lla.removeAt(3));
    lla.display();
  }
}
