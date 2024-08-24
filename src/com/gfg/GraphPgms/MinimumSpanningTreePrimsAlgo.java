package com.gfg.GraphPgms;

import java.util.Arrays;

public class MinimumSpanningTreePrimsAlgo {
	
	static final int V=4;
	
	public static int primMST(int graph[][])
	{
		int[] key = new int[V];
		int res=0;
		Arrays.fill(key, Integer.MAX_VALUE);
		boolean[] mSet= new boolean[V];
		key[0]=0;
		
		for(int count =0; count < V; count++)
		{
			int u=-1;
			
			System.out.println("Count----"+count);
			for(int i=0; i<V; i++)
			{
				System.out.println("Inside for1 loop--i value-"+i);
              System.out.println("u value    "+u+"---mSet[i]---"+mSet[i]+"---key[i]---"+key[i]);
				if(!mSet[i]&&(u==-1 || key[i]<key[u]))
				{	
					System.out.println("Inside if block");
					u=i;
					System.out.println("Inside if block u value--"+u);

				}
			}
			
				mSet[u] = true;
				res+=key[u];
				
				for(int v=0; v<V; v++)
				{
					if(!mSet[v] && graph[u][v]!=0 && graph[u][v]<key[v])
					{
						key[v] = graph[u][v];
					}
				}
			
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int graph[][] = new int[][] {{0,5,8,0},
			                         {5,0,10,15},
			                         {8,10,0,20},
			                         {0,15,20,0}};
			                         
			                         System.out.println("Minimum spanning tree is--"+primMST(graph));
		}

	}


