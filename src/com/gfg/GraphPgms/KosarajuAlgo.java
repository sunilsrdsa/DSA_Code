package com.gfg.GraphPgms;

import java.util.ArrayList;
import java.util.Stack;

public class KosarajuAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V=8;
		
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		
		for(int i=0; i<V; ++i)
		{
			adj.add(new ArrayList<>());
		}
		
		adj.get(0).add(1);
		adj.get(1).add(2);
		adj.get(2).add(0);
		adj.get(2).add(3);
		adj.get(3).add(4);
		adj.get(4).add(5);
		adj.get(5).add(6);
		adj.get(6).add(4);
		adj.get(6).add(7);
		adj.get(4).add(7);
		
		KosarajuAlgo ks = new KosarajuAlgo();
		
		System.out.println("Following are strongly connected Components: ");
		int count = ks.kosaraju(V,adj);
		System.out.println("No of Strongly Connected Components: "+count);

	}

	// Function Call to find the No of Strongly Connected Components
	private int kosaraju(int V, ArrayList<ArrayList<Integer>> adj) {
		// TODO Auto-generated method stub
		//Visited Array
		int[] vis = new int[V];
		
		//Stack Data Structure
		Stack<Integer> st = new Stack<>();
		
		/* Perform initial DFS to store the nodes 
        in stack based on their finishing time */
		for(int i=0; i<V; ++i)
		{
			if(vis[i] == 0)
			{
				dfs(i, vis, adj, st);
			}
		}
		
		// Store the Reversed Graph
		ArrayList<ArrayList<Integer>> adjT = new ArrayList<>();
		for(int i=0; i<V; ++i)
		{
			adjT.add(new ArrayList<>());
		}
		
		
		// Reverse all the edges of graph(reversed Graph)
		for(int i=0; i<V; i++)
		{
			//Mark the node as unvisited
			vis[i]=0;
			
			//add the reversed edge
			for(int it : adj.get(i))
			{
				adjT.get(it).add(i);
			}
		}
		
		/* to store the count of Strongly Connected Components */
		int count = 0;
		
		/* Start DFS call from every Unvisited node based on there 
		  finishing time */
		
		while(!st.isEmpty())
		{
			//get the node from stack
			int node = st.pop();
			
			//If not visited
			if(vis[node] == 0)
			{
				count+=1;
				helperDFS(node, vis, adjT);
				System.out.println();
			}
		}
		
		return count;
	}
	
	/* to perform DFS for finding no of Strongly connected components */
	private void helperDFS(int node, int[] vis, ArrayList<ArrayList<Integer>> adjT) {		
		// Mark the node as visited
		vis[node] = 1;
		
		System.out.print(node+" ");
		//Traverse all the adjacent nodes
		for(int it : adjT.get(node))
		{
			if(vis[it] == 0)
			{
				//REcursively perform dfs if not visited
				helperDFS(it, vis, adjT);
			}
		}
		
	}

	private void dfs(int node, int[] vis, ArrayList<ArrayList<Integer>> adj, Stack<Integer> st) {
		// TODO Auto-generated method stub
		
		//Mork the node as visited
		vis[node] =1;
		
		// Traverse all its neighbours
		for(int it : adj.get(node)) {
			if(vis[it] == 0)
			{
				//Recursively perform DFS if not visited 
				dfs(it, vis, adj, st);
			}
		}
		
		//Push the node in stack
		st.push(node);
	}

}
