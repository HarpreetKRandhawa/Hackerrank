/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node Delete(Node head, int position) {
    Node temp = new Node();
    temp = head;
    if(position == 0){
        return head.next;
    }
    while(--position>0){
        temp = temp.next;
    }
    temp.next = temp.next.next;
    return head;
}


