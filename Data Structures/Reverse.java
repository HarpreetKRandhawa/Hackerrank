/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
Node Reverse(Node head) {
    if(head == null)
        return null;
    Node temp = null;
    while(head != null){
        Node i = temp;
        temp = new Node();
        temp.data = head.data;
        temp.next = i;
        head = head.next;
    }
    return temp;
}

