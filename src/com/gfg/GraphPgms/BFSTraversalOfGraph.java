package com.gfg.GraphPgms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversalOfGraph {
	
	
	private static void BFS(ArrayList<ArrayList<Integer>> adj, int Size, int s)
	{
		boolean[] visited = new boolean[Size+1];
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		visited[s]=true;
		q.add(s);
		
		while(q.isEmpty() == false)
		{
			int u = q.poll();
			System.out.print(u+" ");
			
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Size =5;
		
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(Size);
		
		for(int i=0; i<Size; ++i)
		   adj.add(new ArrayList<Integer>());
		
		addEdge(adj, 0, 1);
		addEdge(adj, 0, 2);
		addEdge(adj, 1, 2);
		addEdge(adj, 1, 3);
		addEdge(adj, 2, 3);
		addEdge(adj, 2, 4);
		addEdge(adj, 3, 4);
		
		System.out.println("Printing Graph Using Adjacency List-----");
		printGraph(adj);
		
		System.out.println(" BFS traversal-----");
		
		// Starting Point
		int start=0;
		BFS(adj, Size, start);
		
		

	}

}
