public class linkedlylist {

  private class Node {
    private int Data;
    private Node Next;
  }

  private Node Head;
  private Node Tail;

  public void addFirst(int d) {
    var node = new Node();
    node.Data = d;
    if (Head == null) {
      Head = node;
      Tail = node;
    }

    else {
      node.Next = Head;
      Head = node;
    }

  }

  public void show() {
    Node current = Head;
    while (current.Next != null) {
      System.out.print(current.Data + " -> ");
      current = current.Next;
    }
    System.out.println(current.Data);
  }

}
