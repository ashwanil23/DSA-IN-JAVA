package com.dsa.lecture.code.Tree;

import java.util.Stack;

public class IterativeInOrderTraversal {
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

    public static void inOrder(TreeNode root){
        if(root == null) return;
        Stack<TreeNode> newStack = new Stack<>();
        TreeNode temp = root;
        while(temp != null || !newStack.isEmpty()){
            if(temp != null){
                newStack.push(temp);
                temp = temp.left;
            }else{
                temp = newStack.pop();
                System.out.print(temp.data+" ");
                temp = temp.right;
            }
        }
    }

    public static void main(String[] args) {
        IterativeInOrderTraversal tree = new IterativeInOrderTraversal();
        TreeNode root = tree.createBinaryTree(1);
        inOrder(root);
    }
}
