import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    var list = new linkedlylist();

    list.addLast(50);
    list.addLast(60);
    list.addLast(70);
    // list.removeFirst();
    System.out.println(Arrays.toString(list.toArray()));
    list.show();
  }
}