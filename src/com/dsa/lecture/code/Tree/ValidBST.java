package com.dsa.lecture.code.Tree;

public class ValidBST {
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

    public TreeNode createBinarySearchTree(TreeNode root , int value){
        if(root == null){
            root = new TreeNode(value);
            return root;
        }
        if(value < root.data){
            root.left = createBinarySearchTree(root.left, value);
        }
        else if(value > root.data){
            root.right =  createBinarySearchTree(root.right, value);
        }
        return root;
    }
    public void insert(int value){
        root = createBinarySearchTree(root, value);
    }

    public boolean isValid(TreeNode root, Long max , Long min){
        if(root == null) return true;
        if(root.data <= min || root.data >= max){
            return false;
        }
        boolean left = isValid(root.left,(long) root.data, min);
        if(left){
            boolean right = isValid(root.right, max, (long)root.data);
            return right;
        }
        return false;
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
        ValidBST tree = new ValidBST();

        tree.insert(10);
        tree.insert(5);
        tree.insert(4);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(18);

        ValidBST tree2 = new ValidBST();
        tree2.root = tree2.createBinaryTree(1);
        System.out.println("Tree 1 is valid : " + tree.isValid(tree.root,Long.MAX_VALUE, Long.MIN_VALUE));
        System.out.println("Tree 2 is valid : " + tree.isValid(tree2.root,Long.MAX_VALUE, Long.MIN_VALUE));
        int key = 4;
        if(tree.searchKey(tree.root, key) != null){
            System.out.printf("%d is present in tree\n",key);
        }else{
            System.out.printf("%d isn't present in tree\n",key);
        }
    }
}
