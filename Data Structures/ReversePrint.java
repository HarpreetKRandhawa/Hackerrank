/*
  Print elements of a linked list in reverse order 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
void ReversePrint(Node head) {
    Node temp = head;
    StringBuilder s = new StringBuilder();
    while(temp != null){
        s.insert(0,Integer.toString(temp.data)+'\n');
        temp = temp.next;
    }
    System.out.print(s);
}

