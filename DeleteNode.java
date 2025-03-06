public class DeleteNode {
    static class Node {
        int data;
        Node left, right;
        Node(int data){
         this.data = data;
        }      
     }

     public static Node delete(Node root, int val){
            if(root.data > val){
                root.left = delete(root.left, val);
            }
            else if(root.data < val){
                root.right = delete(root.right, val);
            }
            //This is the case when root.data == val---> 3 cases
            else{
                // case 1--->val is the leaf node
                if(root.left == null && root.right == null){
                    return null;
                }
                // case 2---->val node has 1 child
                if(root.left == null){
                    return root.right;
                }else if(root.right == null){
                    return root.left;
                }
                // case 3---->val node has 2 children
                Node inorderSucc = findInorderSucc(root.right);
                root.data = inorderSucc.data;
                root.right = delete(root.right, inorderSucc.data);

            }
            return root;
     }
     public static Node findInorderSucc(Node root){
       while(root.left != null){
        root = root.left;
       }
       return root;
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
        System.out.println();
        delete(root, 3);
        inorder(root);
     }
}
