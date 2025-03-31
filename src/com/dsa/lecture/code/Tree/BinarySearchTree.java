package com.dsa.lecture.code.Tree;

public class BinarySearchTree {
    private TreeNode root;

    public class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public BinarySearchTree(){
        root = null;
    }
    public TreeNode createBinaryTree(TreeNode root, int value){
        if(root == null){
            root = new TreeNode(value);
            return root;
        }
        if(value < root.data) root.left  = createBinaryTree(root.left, value);
        else if(value > root.data) root.right = createBinaryTree(root.right, value);
        return root;
    }
    public static void preOrder(TreeNode root){
        if(root == null) return;
        else{
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void inOrder(TreeNode root){
        if(root == null) return;
        else{
            inOrder(root.left);
            System.out.print(root.data+ " ");
            inOrder(root.right);
        }
    }

    public static void postOrder(TreeNode root){
        if(root == null) return;
        else{
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public void insert(int value) {
        root = createBinaryTree(root, value);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(18);

        preOrder(tree.root);
        System.out.println();
        inOrder(tree.root);
        System.out.println();
        postOrder(tree.root);
    }
}
