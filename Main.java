
public class Main {
  public static void main(String[] args) {
    var list = new linkedlylist();

    list.addLast(10);
    list.addLast(20);
    list.addLast(30);
    list.addLast(40);
    list.addLast(50);

    // list.show();
    // list.reverse();
    System.out.println(list.getKthFromEnd(3));
    list.show();
  }
}