package com.dsa.lecture.code.Tree;

import java.util.Stack;

public class IterativePreOrderTraversal {
    private TreeNode root;

    private static class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
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

    public static void preOrder(TreeNode root){
        if(root == null) return;
        Stack<TreeNode> newStack = new Stack<>();
        newStack.push(root);
        while(!newStack.isEmpty()){
            TreeNode tempNode = newStack.pop();
            System.out.print(tempNode.data + " ");

            if(tempNode.right != null){
                newStack.push(tempNode.right);
            }
            if(tempNode.left != null){
                newStack.push(tempNode.left);
            }
        }
    }

    public static void main(String[] args) {
        IterativePreOrderTraversal tree = new IterativePreOrderTraversal();
        TreeNode root = tree.createBinaryTree(1);
        preOrder(root);
    }
}
