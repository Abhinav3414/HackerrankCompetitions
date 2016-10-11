package hackerrank.weekofcode23;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.Iterator;

import java.util.LinkedList;

import java.util.Scanner;

enum TraversalStrategy {

	DEPTH_FIRST,

	BREADTH_FIRST

}

class Node {

	private String identifier;

	private ArrayList<String> children;

	// Constructor

	public Node(String identifier) {

		this.identifier = identifier;

		children = new ArrayList<String>();

	}

	// Properties

	public String getIdentifier() {

		return identifier;

	}

	public ArrayList<String> getChildren() {

		return children;

	}

	// Public interface

	public void addChild(String identifier) {

		children.add(identifier);

	}

}

class Tree {

	public final static int ROOT = 0;
	private HashMap<String, Node> nodes;
	private TraversalStrategy traversalStrategy;

	// Constructors

	public Tree() 
	{
		this(TraversalStrategy.DEPTH_FIRST);
	}

	public Tree(TraversalStrategy traversalStrategy) 
	{
		this.nodes = new HashMap<String, Node>();
		this.traversalStrategy = traversalStrategy;
	}

	// Properties

	public HashMap<String, Node> getNodes() 
	{
		return nodes;
	}


	// Public interface

	public Node addNode(String identifier) {

		return this.addNode(identifier, null);

	}

	public Node addNode(String identifier, String parent) 
	{
		Node node = new Node(identifier);
		nodes.put(identifier, node);
		if (parent != null) 
		{
			nodes.get(parent).addChild(identifier);
		}
		return node;

	}


	public void display(String identifier, int depth) {

		ArrayList<String> children = nodes.get(identifier).getChildren();

		if (depth == ROOT) {

			System.out.println(nodes.get(identifier).getIdentifier());

		} else {

			String tabs = String.format("%0" + depth + "d", 0).replace("0",
					"    "); // 4 spaces

			System.out.println(tabs + nodes.get(identifier).getIdentifier());

		}

		depth++;

		for (String child : children) {

			// Recursive call

			this.display(child, depth);

		}

	}

	public Iterator<Node> iterator(String identifier) {

		return new DepthFirstTreeIterator(nodes, identifier);

	}

}

class DepthFirstTreeIterator implements Iterator<Node> {

	private LinkedList<Node> list;

	public DepthFirstTreeIterator(HashMap<String, Node> tree, String identifier) {

		list = new LinkedList<Node>();

		if (tree.containsKey(identifier)) 
		{
			this.buildList(tree, identifier);
		}

	}

	private void buildList(HashMap<String, Node> tree, String identifier) {

		list.add(tree.get(identifier));

		ArrayList<String> children = tree.get(identifier).getChildren();

		for (String child : children) {

			// Recursive call

			this.buildList(tree, child);

		}

	}

	@Override
	public boolean hasNext() {

		return !list.isEmpty();

	}

	@Override
	public Node next() {

		return list.poll();

	}



}

public class App {

	public static void main(String[] args) {

		Tree tree = new Tree();

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n - 1];

		tree.addNode("1");

		for (int i = 0; i < n - 1; i++)

		{

			a[i] = scan.nextInt();

			tree.addNode(String.valueOf(i + 2), String.valueOf(a[i]));

		}

		tree.display("1",Tree.ROOT);

		System.out.println("\n***** DEPTH-FIRST ITERATION *****");

		Iterator<Node> depthIterator = tree.iterator("4");

		while (depthIterator.hasNext()) {

			Node node = depthIterator.next();

			System.out.println(node.getIdentifier());

		}

	}

}