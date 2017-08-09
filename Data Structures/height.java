	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	static int height(Node root) {
      	if(root == null)
            return -1;
        int leftH = height(root.left);
        int rightH = height(root.right);
        int max = Math.max(leftH,rightH);
        return 1+max;
    }

