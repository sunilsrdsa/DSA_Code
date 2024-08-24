package com.gfg.GraphPgms;

import java.util.Arrays;

public class DijkstraAlgo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int graph[][] = new int[][] { {0, 50, 100, 0},
			                          { 50, 0, 30, 200},
			                          { 100, 30, 0, 20},
			                          { 0, 200, 20, 0},};
		
			                          
			 for(int x : dijkstra(graph,0))
			 {
				 System.out.print(x+" ");
			 }

	}
	
	static final int V=4;

	private static int[] dijkstra(int[][] graph, int src) {
		// TODO Auto-generated method stub
		
		int[] dist = new int[V];
		//int res=0;
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[src]=0;
		
		//To Update the Finalized Vertex
		boolean[] fin = new boolean[V];
		
		 for(int count=0; count<V-1; count++)
		 {
			 int u=-1;
			 System.out.println("i count-------"+count);

			 for(int i=0; i<V; ++i)
			 {
				 System.out.println("i value-------"+i+"-------fin[i]------"+fin[i]);
				 
				 if(u !=-1)
				 {
				 System.out.println("-----------dist[i]--------------"+dist[i]+"--------dist[u]----------"+dist[u]);
				 }
				 // To pick the least values from dist array  dist[i]<dist[u] then u value will be changed
				 if(!fin[i] && (u==-1 || dist[i]<dist[u]))
				 {
					 
					 System.out.println("Inside if block");
					 
					 
						 System.out.println("-----------dist[i]--------------"+dist[i]);
					
					  u=i;
				 }
				 System.out.println("u value---------    "+u);
			 }
			 
			 System.out.print("Finalized array   ");
			 // Set finalized vertex
			 fin[u] = true;
			 for(boolean i : fin)
			 {
				 System.out.print(i+" ");
			 }
			 System.out.println();
			 
			 for(int v=0; v<V; v++)
			 {
				 System.out.println("-----u---  "+u+"----v-- "+v+"-----graph[u][v]----"+graph[u][v]+"------fin[v]-----"+fin[v]);
				 if(graph[u][v]!=0 && fin[v] == false)
					 dist[v]= Math.min(dist[v], dist[u]+graph[u][v]);
			 }
			 
			 for(int i : dist)
			 {
				 System.out.print(i+" ");
			 }
			 System.out.println();
			 
		 }
		 
		return dist;
	}

}
