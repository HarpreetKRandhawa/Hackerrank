    public static Node removeDuplicates(Node head) {
        Node t = head;
        if(head == null || head.next == null){
            return head;
        }
        while(t != null && t.next != null){
            while(t.next != null && t.data == t.next.data){
                t.next = t.next.next;
            }
            t = t.next;
        }
        return head;
    }
