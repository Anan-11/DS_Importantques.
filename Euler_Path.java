
//https://practice.geeksforgeeks.org/problems/eulerian-path-in-an-undirected-graph5052/1#
class Solution{
    static int eulerPath(int N, int graph[][]){
       int counter=0;
        for(int i=0;i<N;i++)
        {
            int incounter=0;
            for(int j=0;j<N;j++)
            {
                if(graph[i][j]==1)
                incounter+=1;
            }
            if(incounter%2!=0)
            {
                counter+=1;
            }
            if(counter>2)
            return 0;
        }
        return 1;
    }
}
// for Euler path to be present , there can be ATMOST two vertices with odd degree.
