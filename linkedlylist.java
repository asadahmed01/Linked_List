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
  private int size;

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
    size++;
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
    size++;
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
      size = 0;
      return;
    }
    // get hold of the second item
    Node current = Head.Next;
    // remove the link between the first and the second
    Head.Next = null;
    // make the head point to the second item which is the first item now
    Head = current;
    size--;
  }

  // removeLast
  public void removeLast() {

    if (Head == null)
      throw new NoSuchElementException("List is empty.");

    // if the list contains only 1 item
    if (Head == Tail) {
      Head = Tail = null;
      size = 0;
      return;
    }
    Node secondlast = Head;
    while (secondlast.Next.Next != null) {
      secondlast = secondlast.Next;
    }
    Tail = secondlast;
    secondlast.Next = null;
    size--;
  }

  // sizeOf method
  public int size() {
    return size;
  }

  // convert the linkedlist to array

  public int[] toArray() {
    int[] array = new int[size];
    int index = 0;
    Node current = Head;
    while (current != null) {
      array[index] = current.Data;
      index++;
      current = current.Next;
    }
    return array;
  }

  // reverse method
  public void reverse() {
    if (Head == null)
      return;
    Node prev = null;
    while (Head != null) {
      var temp = Head;
      Head = Head.Next;
      temp.Next = prev;
      prev = temp;
    }
    Head = prev;
  }

  public int getKthFromEnd(int k) {
    // Node firstNode = Head;
    Node firstNode = Head;
    Node secondNode = Head;
    for (int i = 0; i < k - 1; i++) {
      secondNode = secondNode.Next;
    }
    while (secondNode != Tail) {
      secondNode = secondNode.Next;
      firstNode = firstNode.Next;
    }
    return firstNode.Data;
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
