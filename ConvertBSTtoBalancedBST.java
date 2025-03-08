import java.util.ArrayList;

public class ConvertBSTtoBalancedBST {
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
        }
    }

    // Given the root node of the BST ConvertBSTtoBalancedBST
    public static Node convert(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        return sort(list, 0, list.size() - 1);
    }

    public static void inorder(Node root, ArrayList<Integer> list){
        if(root == null) return;
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }
    public static Node sort(ArrayList<Integer> list, int st, int end){
        if(st > end) return null;
        int mid = st + (end - st)/2;
        Node root = new Node(list.get(mid));
        root.left = sort(list, st, mid-1);
        root.right = sort(list, mid+1, end);
        return root;
}
}
