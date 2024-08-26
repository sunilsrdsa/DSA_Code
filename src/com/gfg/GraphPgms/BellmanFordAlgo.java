package com.gfg.GraphPgms;

import java.util.ArrayList;
import java.util.Arrays;

public class BellmanFordAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int V =6, S=0;
		
		ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
		edges.add(new ArrayList<>(Arrays.asList(3,2,6)));
		edges.add(new ArrayList<>(Arrays.asList(5,3,1)));
		edges.add(new ArrayList<>(Arrays.asList(0,1,5)));
		edges.add(new ArrayList<>(Arrays.asList(1,5,-3)));
		edges.add(new ArrayList<>(Arrays.asList(1,2,-2)));
		edges.add(new ArrayList<>(Arrays.asList(3,4,-2)));
		edges.add(new ArrayList<>(Arrays.asList(2,4,3)));
		
		
		BellmanFordAlgo sol = new BellmanFordAlgo();
		
		int[] ans =sol.bellmanFord(V,edges,S);
		
		if(ans.length == 1 && ans[0] == -1)
		{
			System.out.println("The Graph Contains negative Cycle");
		}
		else
		{
			System.out.println("The Shortest Distance from Source is: ");
			 for(int i=0; i<V; i++)
			 {
				 System.out.print(ans[i]+" ");
			 }
		}

	}

	private int[] bellmanFord(int V, ArrayList<ArrayList<Integer>> edges, int S) {
		// TODO Auto-generated method stub
		
		//To store the distance we are using 1e9 instead of infinity
		int[] dist = new int[V];
		Arrays.fill(dist, (int) 1e9);
		
		// Distance of source to itself is 0
		dist[0] =0;
		
		// Iterate for V-1 times
		for(int i=0; i<V-1; i++)
		{
			 for(ArrayList<Integer> it : edges)
			 {
				 int u= it.get(0);
				 int v= it.get(1);
				 int wt= it.get(2); // edge weight
				 
				 //Edge relaxation
				 if(dist[u] != 1e9 && dist[u]+wt < dist[v])
				 {
					 // Updating the distance
					 dist[v]= dist[u]+wt;
				 }
				 
			 }
		}
		
		/* An Extra relaxation to check if the graph contains 
		  negative cycle   for V  if there is negative cycle it keep on reducing dist[u]+wt < dist[v]
		 */
		
		for(ArrayList<Integer> it : edges)
		{
			int u = it.get(0);
			int v= it.get(1);
			int wt= it.get(2);
			
			//If edge relation is possible then Negative cycle exists */
			
			if(dist[u] != 1e9 && dist[u]+wt < dist[v])
			{
				//return -1;
				
				return new int[] {-1};
			}
		}
		
		
		return dist;
	}

}
