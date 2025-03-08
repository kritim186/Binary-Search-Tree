public class ValidBST {
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
        }
    }

    public static boolean isValid(Node root, Node min, Node max){
        if(root == null) return true;

        if(max != null && root.data >= max.data) return false;
        else if(min != null && root.data <= min.data) return false;

        return isValid(root.left, min, root) && isValid(root.right, root, max);
    }
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(8);

        System.out.println(isValid(root, null, null));
    }
}
