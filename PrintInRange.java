class PrintInRange{
    static class Node {
        int data;
        Node left, right;
        Node(int data){
         this.data = data;
        }      
     }
     public static void printRange(Node root, int k1, int k2){
        if(root == null) return;
        if(k1 <= root.data && root.data <= k2){
            printRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printRange(root.right, k1, k2);
        }else if(root.data > k2){
            printRange(root.left, k1, k2);
        }else{
            printRange(root.right, k1, k2);
        }
     }

     public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(7);
        root.left.right = new Node(3);
        root.left.right.right = new Node(2);
        root.left.right.left = new Node(4);

        printRange(root, 1, 5);
     }
}