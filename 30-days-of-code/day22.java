	public static int getHeight(Node root){
      //Write your code here
        int count = 0;
        if(root == null){
            return -1;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        count = Math.max(left,right) + 1;
        return count;
    }

