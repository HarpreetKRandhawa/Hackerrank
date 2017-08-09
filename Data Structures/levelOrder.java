   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void levelOrder(Node root) {
       Queue<Node> queue = new LinkedList<Node>();
       queue.add(root);
       while(!queue.isEmpty()){
           Node n = queue.remove();
           if(n.left != null)
               queue.add(n.left);
           if(n.right != null)
               queue.add(n.right);
           System.out.print(n.data+" ");
       }
   }

