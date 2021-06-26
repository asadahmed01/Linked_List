import java.util.NoSuchElementException;

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

  // indexOf method
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

  // Contains method
  public boolean contains(int item) {
    return indexOf(item) != -1;
  }

  // RemoveFirst method
  public void removeFirst() {
    if (Head == null)
      throw new NoSuchElementException("List is empty.");

    // if the list contains only 1 item
    if (Head == Tail) {
      Head = Tail = null;
      return;
    }
    // get hold of the second item
    Node current = Head.Next;
    // remove the link between the first and the second
    Head.Next = null;
    // make the head point to the second item which is the first item now
    Head = current;

  }

  // removeLast
  public void removeLast() {

    if (Head == null)
      throw new NoSuchElementException("List is empty.");

    // if the list contains only 1 item
    if (Head == Tail) {
      Head = Tail = null;
      return;
    }
    Node secondlast = Head;
    while (secondlast.Next.Next != null) {
      secondlast = secondlast.Next;

    }

    Tail = secondlast;
    secondlast.Next = null;

  }

  // Display method
  public void show() {
    Node current = Head;
    if (Head == null)
      throw new NoSuchElementException("List is empty.");
    while (current.Next != null) {
      System.out.print(current.Data + " -> ");
      current = current.Next;
    }
    System.out.println(current.Data);
  }

}
