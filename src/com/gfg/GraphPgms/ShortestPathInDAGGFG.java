package com.gfg.GraphPgms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

class AdjListNode
{
	private int v;
	private int weight;
	public AdjListNode(int _v, int _w) {
		v = _v;
		weight = _w;}	
	int getV(){	return v;}
	int getWeight() { return weight; }
}

class Graph
{
	private int V;
	private LinkedList<AdjListNode> adj[];
	public Graph(int v) {
		V = v;
		adj = new LinkedList[V];
		
		for(int i=0; i<v; ++i)
			adj[i] = new LinkedList<AdjListNode>();
	}
	//0 --2--> 1    u=0; v=1; weight=2; u to v g.addEdge(0, 1, 2);
	void addEdge(int u, int v, int weight)
	{
		AdjListNode node = new AdjListNode(v, weight);
		adj[u].add(node);				
	}
	
	void topologicalSortUtil(int v, Boolean visited[], Stack stack)
	{
		visited[v] = true;
		Iterator<AdjListNode> it = adj[v].iterator();
		while(it.hasNext())
		{
			AdjListNode node = it.next();
			if(!visited[node.getV()])
				topologicalSortUtil(node.getV(), visited, stack);				
		}		
		stack.add(v);
	}
	
	// s --> is the starting point
	public void shortestPath(int s) {
		
		//Create a stack to store the toposort
        Stack stack = new Stack();
        //Store the Distance
        int dist[] = new int[V];
        
        Boolean visited[] = new Boolean[V];
        for(int i=0; i<V; i++)
        	visited[i] = false;
        
        // Code for doing Topological sort and store the toposort values in stack
        for(int i=0; i<V; ++i)
        {
        	if(visited[i] == false)
        		topologicalSortUtil(i, visited, stack);
        }
        
        for(int i=0; i<V; ++i)
        	dist[i] = Integer.MAX_VALUE;
        
        //Source distance will be 0
        dist[s] =0;
        
        while(stack.empty() == false)
        {
        	int u = (int)stack.pop();
        	
        	Iterator<AdjListNode> it;
        	
        	if(dist[u] != Integer.MAX_VALUE)
        	{
        		it = adj[u].iterator();
        		
        		while(it.hasNext())
        		{
        			AdjListNode i = it.next();
        			
        			if(dist[i.getV()] > dist[u]+i.getWeight())
        				dist[i.getV()] = dist[u]+i.getWeight();
        		}
        	}
        }
        
        for(int i=0; i< V; ++i)
        {
        	if(dist[i] == Integer.MAX_VALUE)
        		System.out.print("INF");
        	else
        		System.out.print(dist[i]+" ");
        }
        
        
		
	}
}

public class ShortestPathInDAGGFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph g = new Graph(6);
              g.addEdge(0, 1, 2);
              g.addEdge(0, 4, 1);
              g.addEdge(1, 2, 3);
              g.addEdge(4, 2, 2);
              g.addEdge(4, 5, 4);
              g.addEdge(2, 3, 6);
              g.addEdge(5, 3, 1);
              
              int s = 0;
              
              System.out.println("Find the Shortest Distance from Source "+s);
              
              g.shortestPath(s);
	}

}
