package com.gfg.BinaryTreesPgms;

import java.util.*;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    // Default constructor for TreeNode
    TreeNode() {
        this.val = 0;
        this.left = null;
        this.right = null;
    }

    // Constructor with a value
    // parameter for TreeNode
    TreeNode(int x) {
        this.val = x;
        this.left = null;
        this.right = null;
    }

    // Constructor with value, left
    // child, and right child
    // parameters for TreeNode
    TreeNode(int x, TreeNode left, TreeNode right) {
        this.val = x;
        this.left = left;
        this.right = right;
    }
}

public class LevelOrderTraversal {
	
	static void printList(List<Integer> list) {
        // Iterate through the
        // list and print each element
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Create an instance
        // of the Solution class
        LevelOrderTraversal solution = new LevelOrderTraversal();
        // Perform level-order traversal
        List<List<Integer>> result = solution.levelOrder(root);

        System.out.println("Level Order Traversal of Tree:");

        // Printing the level order traversal result
        for (List<Integer> level : result) {
            printList(level);
        }

	}

	private List<List<Integer>> levelOrder(TreeNode root) {
		// TODO Auto-generated method stub
        List<List<Integer>> ans = new ArrayList<>();
		 if(root == null)
		 {
			 return ans;
		 }
		 Queue<TreeNode> q = new LinkedList<>();
		 q.add(root);
		 
		 while(!q.isEmpty())
		 {
			 int size = q.size();
			 List<Integer> level = new ArrayList<>();

		  for(int i=0; i<size; i++)
		  {
			 TreeNode curr = q.poll();
			 level.add(curr.val);
			 if(curr.left !=null)
			 {
				 q.add(curr.left);
			 }
			 
			 if(curr.right !=null)
			 {
				 q.add(curr.right);
			 }
			 
		   }
		 ans.add(level);
		
	}
		 return ans;

}
}
