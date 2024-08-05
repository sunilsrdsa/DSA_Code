package com.gfg.GraphPgms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CountConnectedComponentsUndirectedGraph {
	
private static void BFS(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited)
{
	Queue<Integer> q = new LinkedList<Integer>();
	
	visited[s]=true;
	q.add(s);
	
	while(q.isEmpty() == false)
	{
		int u = q.poll();
		System.out.print(" "+u);
		
		for(int v : adj.get(u))
		{
			if(visited[v] == false)
			{
				visited[v] = true;
				q.add(v);
			}
		}
	}
	
}

private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
{
	adj.get(u).add(v);
	adj.get(v).add(u);
}

private static void printGraph(ArrayList<ArrayList<Integer>> adj)
{
	for(int i=0; i<adj.size(); ++i)
	{
		for(int j=0; j<adj.get(i).size(); ++j)
		{
			System.out.print(adj.get(i).get(j)+" ");
		}
		System.out.println();
	}
	
}

private static int BFSDisConnect(ArrayList<ArrayList<Integer>> adj, int V)
{
	int count =0;
	boolean[] visited = new boolean[V+1];
	
	for(int i=0; i<V; ++i)
	{
		if(visited[i] == false)
		{
			BFS(adj, i, visited);
			++count;
		}
	}
	
	return count;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int SIZE = 9;
		
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(SIZE);
		
		for(int i=0; i<SIZE; ++i)
			adj.add(new ArrayList<Integer>());
		
		addEdge(adj, 0, 1);
		addEdge(adj, 1, 2);
		addEdge(adj, 0, 2);
		addEdge(adj, 3, 4);
		addEdge(adj, 5, 6);
		addEdge(adj, 5, 7);
		addEdge(adj, 7, 8);


		System.out.println("Printing Graph Using Adjacency List-----");
		printGraph(adj);
		
		System.out.println(" BFS traversal of Disconnected Graph-----");
		
		// Starting Point
		int count =BFSDisConnect(adj, SIZE);
		System.out.println("");
		
		System.out.println("No of Connected Components----"+count);

	}

}
