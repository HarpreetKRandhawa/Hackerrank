/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    int headAlen = 0;
    int headBlen = 0;
    Node headAcopy = headA;
    Node headBcopy = headB;
    while(headAcopy != null){
        headAcopy = headAcopy.next;
        headAlen++;
    }
    while(headBcopy != null){
        headBcopy = headBcopy.next;
        headBlen++;
    }
    while(headAlen > headBlen){
        headA = headA.next;
        headAlen--;
    }
    while(headBlen > headAlen){
        headB = headB.next;
        headBlen--;
    }
    while(headA != null){
        if(headA == headB)
            return headA.data;
        headA = headA.next;
        headB = headB.next;
    }
    return -1;
}

