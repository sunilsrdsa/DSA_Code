package com.gfg.GraphPgms;

import java.util.Iterator;
import java.util.LinkedList;

public class ArticulationPointAlgo {
	
	private int V;
	
	private LinkedList<Integer> adj[];
	int time = 0;
	static final int NIL =-1;
	
	ArticulationPointAlgo(int v)
	{
		V =v;
		adj = new LinkedList[v];
		for(int i=0; i<v; ++i)
		{
			adj[i] = new LinkedList<>();
		}
		
	}
	
	void addEdge(int v, int w)
	{
		adj[v].add(w);
		adj[w].add(v);
	}
	
	private void AP() {
		// TODO Auto-generated method stub
		
		boolean visited[] = new boolean[V];
		int disc[] = new int[V];
		int low[] = new int[V];
		int parent[] = new int[V];
		boolean ap[] = new boolean[V];
		
		for(int i=0; i<V; ++i)
		{
			parent[i] = NIL;
			visited[i] = false;
			ap[i] = false;
		}
		
		for(int i=0; i<V; i++)
		{
			System.out.println("Loop-----i value-----  "+i);
			if(visited[i] == false)
				APUtil(i, visited, disc, low, parent, ap);
		}
		
		
		for(int i=0; i<V; i++)
		{
			if(ap[i] == true)
				System.out.print(i+" ");
		}
		
	}


	void APUtil(int u, boolean[] visited, int[] disc, int[] low, int[] parent, boolean[] ap) {
		// TODO Auto-generated method stub
		
		System.out.println("Inside ApUTIL----u value  "+u);
		
		int children = 0;
		
		visited[u] = true;
		
		disc[u] = low[u] = ++time;
		
		System.out.println("----disc[u]-----  "+disc[u]+"------low[u]------ "+low[u]);
		
		Iterator<Integer> i = adj[u].iterator();
		
		while(i.hasNext())
		{
			int v = i.next();
			
			System.out.println("---$---v----- "+v);
			if(!visited[v])
			{
				children++;
				System.out.println("------children----- "+children);

				parent[v] = u;
				
				System.out.println("------u----- "+u);

				
				APUtil(v, visited, disc, low, parent, ap);
			
				System.out.println("------low[u]----- "+low[u]+"-------------- "+low[v]);
				
				low[u] = Math.min(low[u],low[v]);
				
				System.out.println("------low[u]----- "+low[u]);

				
				if(parent[u] == NIL && children >1)
					ap[u] = true;
				
				if(parent[u] !=NIL && low[v] >= disc[u])
					ap[u] = true;
				
			}
			else if(v!= parent[u])
			{
				System.out.println("-----v----- "+v+"---parent[u]--  "+parent[u]);

				low[u] = Math.min(low[u], disc[v]);
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Articulation Points in first Graph");
		
		ArticulationPointAlgo g = new ArticulationPointAlgo(7);
		g.addEdge(1, 0);
		g.addEdge(1, 2);
		g.addEdge(1, 4);
		g.addEdge(2, 3);
		g.addEdge(0, 3);
		g.addEdge(4, 5);
		g.addEdge(4, 6);
		g.addEdge(5, 6);	
		g.AP();
		
		
		

	}

	
}
