package com.dsa.lecture.code.Tree;

public class FindMaximum {
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

    public static int findMax(TreeNode rootNode){
        if(rootNode == null) return Integer.MIN_VALUE;
        int result = rootNode.data;
        int left = findMax(rootNode.left);
        int right = findMax(rootNode.right);

        if(left > result) return left;
        if(right > result) return right;
        return result;
    }
    public static void main(String[] args) {
        FindMaximum tree = new FindMaximum();
        TreeNode root = tree.createBinaryTree(1);
        System.out.println("Maximum is : " + findMax(root));
    }
}
