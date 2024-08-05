package com.gfg.GraphPgms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSDisconnectedGraph {
	
	private static void BFS(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited)
	{
		//boolean[] visited = new boolean[Size+1];
		
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int Size =7;
		
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(Size);
		
		for(int i=0; i<Size; ++i)
		   adj.add(new ArrayList<Integer>());
		
		addEdge(adj, 0, 1);
		addEdge(adj, 0, 2);
		addEdge(adj, 1, 3);
		addEdge(adj, 2, 3);
		addEdge(adj, 4, 5);
		addEdge(adj, 4, 6);
		addEdge(adj, 5, 6);

		
		System.out.println("Printing Graph Using Adjacency List-----");
		printGraph(adj);
		
		System.out.println(" BFS traversal of Disconnected Graph-----");
		
		// Starting Point
		BFSDisConnect(adj, Size);

	}
	
	
	private static void BFSDisConnect(ArrayList<ArrayList<Integer>> adj, int V)
	{
		boolean visited[]= new boolean[V+1];
		for(int i=0; i<V; i++)
		{
			//System.out.println("Called"+i);
			if(visited[i] == false)
				BFS(adj, i, visited);
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

}
