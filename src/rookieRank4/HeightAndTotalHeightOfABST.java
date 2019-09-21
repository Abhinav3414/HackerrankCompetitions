package rookieRank4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


	class Node {
		
		int data;
		Node left, right;
		
		Node(int d) {
			data = d;
			left = right = null;
		}
	}

	public class HeightAndTotalHeightOfABST {
		
		static int totalheight =0;
		int findHeight(Node aNode) {
		    if (aNode == null) {
		        return -1;
		    }

		    int lefth = findHeight(aNode.left);
		    int righth = findHeight(aNode.right);

		    if (lefth > righth) {
		    	totalheight= totalheight + (lefth+1);
		        return lefth + 1;
		    } else {
		    	totalheight= totalheight + (righth+1);
		        return righth + 1;
		    	
		    }
		}
		
		
		static Node root;

		/* A function that constructs Balanced Binary Search Tree from a sorted array */
		Node sortedArrayToBST(int arr[], int start, int end) {
			if (start > end) {
				return null;
			}
			int mid = (start + end) / 2;
			Node node = new Node(arr[mid]);
			node.left = sortedArrayToBST(arr, start, mid - 1);
			node.right = sortedArrayToBST(arr, mid + 1, end);
			return node;
		}

	/*	 A utility function to print preorder traversal of BST 
		void preOrder(Node node) {
			if (node == null) {
				return;
			}
			System.out.print(node.data + " ");
			preOrder(node.left);
			preOrder(node.right);
		}*/
		
		public static void main(String[] args) {
			HeightAndTotalHeightOfABST tree = new HeightAndTotalHeightOfABST();

			Scanner scan = new Scanner(System.in);
			List<Integer> list= new ArrayList<>();
			
			int n=scan.nextInt();
			for(int i=0;i<n;i++)
				list.add(scan.nextInt());
			
			Collections.sort(list);
			Integer[] integers = list.toArray(new Integer[list.size()]);
			int a[]= new int[integers.length];
			
			for(int jj=0;jj<integers.length;jj++)
				a[jj]=integers[jj];
			
			int length = integers.length;
			root = tree.sortedArrayToBST(a, 0, length - 1);

			//tree.preOrder(root);
			int h=tree.findHeight(root);
			
			System.out.println(h);
			System.out.println(totalheight);

		}
	}
	
