package com.gfg.GraphPgms;

import java.util.ArrayList;

public class DFSGraphDisConnected {
	
	private static void DFSRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited)
	{
		visited[s] = true;
		System.out.print(s+" ");
		
		 for(int u : adj.get(s))
		 {
			 if(visited[u] == false)
			 {
				 DFSRec(adj, u, visited);
			 }
		 }
	}
	
	
	private static void DFS(ArrayList<ArrayList<Integer>> adj, int V)
	{
		boolean[] visited = new boolean[V];
		
		for(int i=0; i<V; ++i)
		{
			if(visited[i] == false)
				DFSRec(adj, i, visited);
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int SIZE =5;
		
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(SIZE);

		for(int i=0; i<SIZE; ++i)
		  adj.add(new ArrayList<Integer>());
		
		addEdge(adj, 0, 1);
		addEdge(adj, 0, 2);
		addEdge(adj, 1, 2);
		addEdge(adj, 3, 4);
		System.out.println("Printing Graph Using Adjacency List-----");
		printGraph(adj);
		
		System.out.println(" DFS traversal of  Disconnected Graph-----");
		
		DFS(adj, SIZE);
	}

}
