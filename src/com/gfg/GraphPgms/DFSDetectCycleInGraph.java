package com.gfg.GraphPgms;

import java.util.ArrayList;

public class DFSDetectCycleInGraph {
	
	private static boolean DFSRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, int parent)
	{
		
		visited[s] =true;
		
		for(int u : adj.get(s))
		{
			if(visited[u] == false)
			{
				if(DFSRec(adj, u, visited, s) == true)
						return true;
			}
			else if(u!=parent)
			{
				return true;
			}
		}
		
		return false;
		
		
	}
	
	
	private static boolean DFS(ArrayList<ArrayList<Integer>> adj, int V)
	{
		boolean[] visited = new boolean[V];
		
		for(int i=0; i<V; ++i)
		{
			if(visited[i] == false)
			{
				if(DFSRec(adj, i, visited, -1) == true)
					return true;
			}
		}
		
		return false;
	}
	
	private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
	{
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int V=6;
		
		int V2=5;
		
		int V3=3;
		
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
		
		ArrayList<ArrayList<Integer>> adj2 = new ArrayList<ArrayList<Integer>>(V2);
		
		ArrayList<ArrayList<Integer>> adj3 = new ArrayList<ArrayList<Integer>>(V3);


		
		for(int i=0; i<V; ++i)
			adj.add(new ArrayList<Integer>());
		
		for(int i=0; i<V2; ++i)
			adj2.add(new ArrayList<Integer>());
		
		for(int i=0; i<V3; ++i)
			adj3.add(new ArrayList<Integer>());
		
		addEdge(adj, 0, 1);
		addEdge(adj, 1, 2);
		addEdge(adj, 1, 3);
		addEdge(adj, 2, 3);
		addEdge(adj, 2, 4);
		addEdge(adj, 4, 5);
		
		
		//For Diconnected Graph
		
		addEdge(adj2, 0, 1);
		addEdge(adj2, 2, 3);
		addEdge(adj2, 3, 4);
		addEdge(adj2, 4, 2);
		
		
		//Non Cyclic Graph
		addEdge(adj3, 0, 1);
		addEdge(adj3, 1, 2);


		
		if(DFS(adj, V) == true)
			System.out.println("Cycle Found");
		else
			System.out.println("Cycle not found");
		
		
		if(DFS(adj2, V2) == true)
		System.out.println("Cycle Found in Disconnected Graph");
	      else
		System.out.println("Cycle not found in Disconnected Graph");
		
		
		if(DFS(adj3, V3) == true)
		     {
			System.out.println("Cycle Found in Non Cyclic Graph");
		      }
		      else
		      {
			System.out.println("Cycle not found in Non Cyclic  Graph");
		      }

	}

}
