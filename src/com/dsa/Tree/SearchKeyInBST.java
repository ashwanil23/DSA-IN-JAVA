package com.dsa.Tree;

public class SearchKeyInBST {
    private static TreeNode root;

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

    public TreeNode createBinaryTree(TreeNode root , int value){
        if(root == null){
            root = new TreeNode(value);
            return root;
        }
        if(value < root.data){
            root.left = createBinaryTree(root.left, value);
        }
        else if(value > root.data){
            root.right =  createBinaryTree(root.right, value);
        }
        return root;
    }
    public void insert(int value){
        root = createBinaryTree(root, value);
    }
    public TreeNode searchKey(TreeNode rootNode, int key){
        if(rootNode == null || rootNode.data == key) return rootNode;
        if(key < rootNode.data){
            return searchKey(rootNode.left, key);
        }else{
            return searchKey(rootNode.right, key);
        }
    }

    public static void main(String[] args) {
        SearchKeyInBST tree = new SearchKeyInBST();
        tree.insert(10);
        tree.insert(5);
        tree.insert(4);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(18);

        int key = 4;
        if(tree.searchKey(root, key) != null){
            System.out.printf("%d is present in tree\n",key);
        }else{
            System.out.printf("%d isn't present in tree\n",key);
        }
    }
}
