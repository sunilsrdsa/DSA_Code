package com.gfg.GraphPgms;

import java.util.Iterator;
import java.util.LinkedList;

public class BridgesInGraph {
	
	// No. of vertices
	private int V;
	
    // Array  of lists for Adjacency List Representation
	private LinkedList<Integer> adj[];
	int time = 0;
	static final int NIL =-1;

	public BridgesInGraph(int v) {
		// TODO Auto-generated constructor stub
		V =v;
		adj = new LinkedList[v];
	    for(int i=0; i<v; ++i)
	    {
	    	adj[i] = new LinkedList();
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bridges In Graph");
		
		BridgesInGraph g = new BridgesInGraph(5);
		g.addEdge(1,0);
		g.addEdge(0,2);
		g.addEdge(2,1);
		g.addEdge(0,3);
		g.addEdge(3,4);
		
		g.bridge();


	}

	private void bridge() {
		// TODO Auto-generated method stub
		
        // Mark all the vertices as not visited
		boolean visited[] = new boolean[V];
		int disc[] = new int[V];
		int low[] = new int[V];
		int parent[] = new int[V];
		
		// Initialize parent and visited
		for(int i=0; i<V; i++)
		{
			parent[i] = NIL;
			visited[i] = false;
		}
		
		// Call the recursive helper function to find Bridges
        // in DFS tree rooted with vertex 'i'
		for(int i=0; i<V; i++)
		{
			System.out.println("--Step1-  i-  "+i);
			if(visited[i] == false)
			{
				bridgeUtil(i, visited, disc, low, parent);
			}
		}
		
	}
	
	// A recursive function that finds and prints bridges
    // using DFS traversal
    // u --> The vertex to be visited next
    // visited[] --> keeps tract of visited vertices
    // disc[] --> Stores discovery times of visited vertices
    // parent[] --> Stores parent vertices in DFS tree
	private void bridgeUtil(int u, boolean[] visited, int[] disc, int[] low, int[] parent) {
		// TODO Auto-generated method stub
		
		System.out.println("Step2------u--- "+u);
		
        // Mark the current node as visited
		visited[u] = true;
		
        // Initialize discovery time and low value
		disc[u] = low[u] = ++time;
		
		System.out.println("------disc[u]------ "+disc[u]+"-------low[u]------ "+low[u]);
		
        // Go through all vertices adjacent to this
		Iterator<Integer> i = adj[u].iterator();
		
		while(i.hasNext())
		{
			int v = i.next(); // v is current adjacent of 

			System.out.println("Step3--------v------ "+v);
			
			// If v is not visited yet, then make it a child
            // of u in DFS tree and recur for it.
            // If v is not visited yet, then recur for it
			if(!visited[v])
			{
				System.out.println("Step4--------visited[v]------ "+visited[v]+"--------parent[v]------ "+parent[v]);

				parent[v] = u;
				System.out.println("----parent["+v+"]--- "+parent[v]);
				bridgeUtil(v, visited, disc, low, parent);
				
				
				System.out.println("----low[u]---- "+low[u]+"------low[v]------ "+low[v]);
				// Check if the subtree rooted with v has a
                // connection to one of the ancestors of u
				low[u] = Math.min(low[u], low[v]);
				
				System.out.println("----low[u]---- "+low[u]);

				
				
				System.out.println("------low[v]------ "+low[v]+"-----disc[u]---- "+disc[u]);
				// If the lowest vertex reachable from subtree
                // under v is below u in DFS tree, then u-v is
                // a bridge
				if(low[v] > disc[u])
					System.out.println(u+" "+v);
			}
			else if(v != parent[u])  // Update low value of u for parent function calls.
			{   //for example parent of 1 is 0  v = 0   u = 1  parent[1]=0    
				//0 != parent[1]  0 !=0  fails does not enter loop
				System.out.println(u+" "+v);
				
				System.out.println("-----parent[u]---- "+parent[u]);


				System.out.println("------low[u]------ "+low[u]+"-----disc[v]---- "+disc[v]);

				low[u] = Math.min(low[u], disc[v]);
			}
		}
		
		
	}

    // Function to add an edge into the graph
	private void addEdge(int v, int w) {
		// TODO Auto-generated method stub
		adj[v].add(w);// Add w to v's list
		adj[w].add(v);//Add v to w's list
		
	}

}
