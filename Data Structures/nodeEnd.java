/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
    Node root = head;
    Node temp = new Node();
    temp.data = data;
    if(head == null){
        head = temp;
        return head;
    }
    while(root.next != null){
        root = root.next;
    }
    root.next = temp;
    return head;
}

