class Solution {
    public int findCenter(int[][] edges) {
        //calculating no. of edges
        int row = edges.length + 1;
        //create an array of edges
        int edgeCount[] = new int[row+1];
        //for each edge in edges
        for(int edge[]: edges)
        {
            int x = edge[0];
            int y = edge[1];
            edgeCount[x]++;
            edgeCount[y]++;
            if(edgeCount[x]>1)
                return x;
            if(edgeCount[y]>1)
                return y;
        }
        return 0;
    }
}