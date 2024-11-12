package com.dsa.Tree;

import com.sun.source.tree.Tree;

import java.util.Stack;

public class IterativePostOrderTraversal {
    private TreeNode root;

    public static class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
     public TreeNode createBinaryTree(int data){
        TreeNode firstNode = new TreeNode(data);
        TreeNode secondNode = new TreeNode(2);
        TreeNode thirdNode = new TreeNode(3);
        TreeNode forthNode = new TreeNode(4);
        TreeNode fifthNode = new TreeNode(5);

         root = firstNode;
         firstNode.left = secondNode;
         firstNode.right = thirdNode;

         secondNode.left = forthNode;
         secondNode.right = fifthNode;
         return root;
     }

     public static void postOrder(TreeNode root){
        if(root == null) return;
         Stack<TreeNode> newStack = new Stack<>();
         TreeNode current = root;
         while(!newStack.isEmpty() || current != null){
             if(current != null){
                 newStack.push(current);
                 current = current.left;
             }else{
                 TreeNode temp = newStack.peek().right;
                 if(temp == null){
                     temp = newStack.pop();
                     System.out.print(temp.data + " ");
                     while(!newStack.isEmpty() && temp == newStack.peek().right){
                         temp = newStack.pop();
                         System.out.print(temp.data + " ");
                     }
                 }else{
                     current = temp;
                 }
             }
         }
     }

    public static void main(String[] args) {
        IterativePostOrderTraversal tree = new IterativePostOrderTraversal();
        postOrder(tree.createBinaryTree(1));
    }
}
