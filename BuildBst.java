class BuildBst{
    static class Node {
       int data;
       Node left, right;
       Node(int data){
        this.data = data;
       }      
    }

    public static Node buildBST(Node root, int val){
        if(root == null) {
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = buildBST(root.left, val);
        }else{
            root.right = buildBST(root.right, val);
        }
        return root;
    }
    //Traverse the tree 
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] val = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int i = 0; i < val.length; i++) {
            root = buildBST(root, val[i]);
        }
        inorder(root);
    }
}