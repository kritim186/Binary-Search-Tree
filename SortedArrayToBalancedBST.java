public class SortedArrayToBalancedBST {
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
        }
    }

    //Function to create a BST from a sorted array.
public static Node sort(int[] nums, int st, int end){
        if(st > end) return null;
        int mid = st + (end - st)/2;
        Node root = new Node(nums[mid]);
        root.left = sort(nums, st, mid-1);
        root.right = sort(nums, mid+1, end);
        return root;
}

//Given a sorted Array nums --> create a BST out of it and return the root node
    public static Node balancedBst(int[] nums){
        return sort(nums, 0, nums.length);
    }

public static void main(String[] args) {
    /*
         8
        / \
       6   10
      /     \
     5       11
    /         \
   3           12

   unbalanced BST
     */

 
} 
}
