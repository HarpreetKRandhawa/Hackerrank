    public static  Node insert(Node head,int data) {
        //Complete this method
        Node root = new Node(data);
        if(head == null){
            head = root;
        }
        else{
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = new Node(data);
        }
        return head;
    }

