package com.dsa.Tree;

public class RecursivePostOrderTraversal {
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
        else{
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
     }

    public static void main(String[] args) {
        RecursivePostOrderTraversal tree = new RecursivePostOrderTraversal();
        postOrder(tree.createBinaryTree(1));
    }
}
