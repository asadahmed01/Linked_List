import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    var list = new linkedlylist();

    list.addLast(10);
    list.addLast(20);
    list.addLast(30);
    list.addLast(40);
    list.addLast(50);
    list.addLast(60);
    list.addLast(70);

    // list.show();
    // list.reverse();
    // list.findMiddleNode();
    System.out.println(list.hasLoop());
    list.show();
  }
}