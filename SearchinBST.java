public class SearchinBST {
    static class Node {
        int data;
        Node left, right;
        Node(int data){
         this.data = data;
        }      
     }
     public static boolean search(Node root, int val){
        if(root == null) return false;

        if(root.data == val) return true;
        if(root.data > val){
            return search(root.left, val);
        }else{
            return search(root.right, val);
        }
       
     }
     public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

     public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(7);
        root.left.right = new Node(3);
        root.left.right.right = new Node(2);
        root.left.right.left = new Node(4);
        inorder(root);
       System.out.println(search(root, 3));
       inorder(root);
     }
}
