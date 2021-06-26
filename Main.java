
public class Main {
  public static void main(String[] args) {
    var list = new linkedlylist();
    // list.addFirst(10);
    // list.addFirst(20);
    // list.addFirst(30);
    // list.addFirst(10);
    list.addLast(20);
    list.addLast(30);
    list.addLast(40);
    list.addLast(50);
    list.removeLast();
    list.show();
  }
}