public class linkedlylist {

  private class Node {
    private int Data;
    private Node Next;

    public Node(int value) {
      this.Data = value;
    }
  }

  private Node Head;
  private Node Tail;

  public void addFirst(int d) {
    // create new node
    var node = new Node(d);

    // if there is no nodes already in the list
    if (Head == null) {
      // point the head to the new node
      Head = node;
      // point the tail to the new node
      Tail = node;
    }

    else {
      // if there is a node already
      // point the Next of the new node to the head
      node.Next = Head;
      // then move the head to point to the newly created node
      Head = node;
    }

  }

  // addLast Method
  public void addLast(int data) {
    // creae new node
    var node = new Node(data);

    if (Head == null)
      Head = Tail = node;

    else {
      Tail.Next = node;
      Tail = node;
    }
  }

  public int indexOf(int item) {
    Node current = Head;
    int index = 0;
    while (current != null) {
      if (current.Data == item)
        return index;
      current = current.Next;
      index++;
    }

    return -1;
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
