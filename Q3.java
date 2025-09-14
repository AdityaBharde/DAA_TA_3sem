import java.util.*;
public class Q3{
    public static void findMinCost(int[][] graph){
        int n=graph.length;
        int[] cost=new int[n];
        int[] path=new int[n];
        cost[n-1]=0;
        for(int i=n-2;i>=0;i--){
            int minCost=Integer.MAX_VALUE;
            int nextNode=-1;
            for(int j=i+1;j<n;j++){
                if(graph[i][j]!=0){
                    if(graph[i][j]+cost[j]<minCost){
                        minCost=graph[i][j]+cost[j];
                        nextNode=j;
                    }
                }
            }
            cost[i]=minCost;
            path[i]=nextNode;
        }
        System.out.println("Minimum cost path:");
        int current=0;
        while(current!=-1&&current<n){
            System.out.print(current);
            if(path[current]!=-1)System.out.print("->");
            current=path[current];
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[][] graph = {
                {0, 1, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0,0,0},
                {0, 0, 0, 0, 4, 11, 0, 0, 0, 0, 0, 0,0,0},
                {0, 0, 0, 0, 9, 5, 16, 0, 0, 0, 0, 0,0,0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0,0,0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0,0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0,0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0,0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0,0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0,0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0,0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0,0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0,0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0,0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0,0}
        };
        System.out.println("Graph 1 Test Case");
        findMinCost(graph);
        int[][] graph2={
                {0,1,2,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,5,6,0,0,0,0,0,0,0,0,0},
                {0,0,0,4,3,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,7,8,9,0,0,0,0,0,0},
                {0,0,0,0,0,6,5,4,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,10,11,0,0,0,0},
                {0,0,0,0,0,0,0,0,9,8,0,0,0,0},
                {0,0,0,0,0,0,0,0,7,6,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,12,13,0,0},
                {0,0,0,0,0,0,0,0,0,0,11,10,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,14,15},
                {0,0,0,0,0,0,0,0,0,0,0,0,15,14},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        System.out.println("Graph 2 Test Case");
        findMinCost(graph2);

    }
}
