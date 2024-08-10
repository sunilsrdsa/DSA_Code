package com.gfg.GraphPgms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CycleDetectionDirectedGraphKahnsAlgo {
	
	private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
	{
		adj.get(u).add(v);
	}
	
	private static void topologicalSort(ArrayList<ArrayList<Integer>> adj, int V)
	{
		int[] in_degree = new int[V];
		
		for(int u = 0; u < V; u++)
		{
			for(int x : adj.get(u))
				in_degree[x]++;
		}
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i=0; i<V; ++i)
		{
			if(in_degree[i] == 0)
				q.add(i);
		}
		
		int count =0;
		
		while(q.isEmpty() == false)
		{
			int u = q.poll();
			for(int x : adj.get(u))
			{
				if(--in_degree[x] == 0)
					q.add(x);
			}
			count++;
		}
		
		if(count !=V)
		{
			System.out.println("There Exist a Cycle in Graph");
		}
		else
		{
			System.out.println("No cycle in Graph");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int V = 5; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

			addEdge(adj,0, 1); 
            addEdge(adj,4, 1); 
            addEdge(adj,1, 2); 
            addEdge(adj,2, 3); 
            addEdge(adj,3, 1);  
		
        topologicalSort(adj,V);

	}

}
