/*class Node {
     int data;
     Node next;
  }*/
    
Node InsertNth(Node head, int data, int position) {
    Node temp = new Node();
    temp.next = head;
    
    Node temp2 = temp;
    for(int i=0; i < position; i++){
        temp2 = temp2.next;
    }
    Node node = new Node();
    node.data = data;
    node.next = temp2.next;
    temp2.next = node;
    
    return temp.next;
}

