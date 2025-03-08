import java.util.ArrayList;

import javax.swing.Spring;

public class Path {
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
        }
    }
    //Print all the possible paths from the root to leaf Node

    public static void printPathRoot2Leaf(Node root,  ArrayList<Integer> list){
        
        if(root == null){
            return;
        }

        list.add(root.data);
        
        if(root.left == null && root.right == null){
            printPaths(list);
        }
        printPathRoot2Leaf(root.left, list);
        printPathRoot2Leaf(root.right, list);
        list.remove(list.size()-1);
        
    }

    public static void printPaths(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"->");
        }
        System.out.println();
    }

    public static void main(String[] args) {
           Node root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(7);
        root.left.right = new Node(3);
        root.left.right.right = new Node(2);
        root.left.right.left = new Node(4);

        printPathRoot2Leaf(root, new ArrayList<>());
    }
}
