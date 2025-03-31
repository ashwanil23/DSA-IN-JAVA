package com.dsa.lecture.code.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class IterativeLevelOrderTraversal {
    private TreeNode root;
     public class TreeNode{
         private TreeNode left;
         private TreeNode right;
         private int data;

         public TreeNode(int data){
             this.data = data;
             this.left = null;
             this.right = null;
         }
     }
    public void createBinaryTree(int data){
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
    }

    public void levelTraversal(){
        if(root == null) return;
        else{
            Queue<TreeNode> newQueue = new LinkedList<>();
            newQueue.offer(root);
            while(!newQueue.isEmpty()){
                TreeNode temp = newQueue.poll();
                System.out.println(temp.data+ " ");
                if(temp.left != null){
                    newQueue.offer(temp.left);
                }
                if(temp.right != null){
                    newQueue.offer(temp.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        IterativeLevelOrderTraversal tree = new IterativeLevelOrderTraversal();
        tree.createBinaryTree(1);
        tree.levelTraversal();
    }
}
