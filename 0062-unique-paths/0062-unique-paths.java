class Solution {
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        for(int i = 0;i<m;i++){
            Arrays.fill(memo[i],-1);
        }
        return recursion(0,0,m,n,memo);
    }
    public int recursion(int x,int y,int m,int n,int[][] memo){
        if(x==m-1 && y == n-1){
            return 1;
        }
        if(memo[x][y]!=-1){
            return memo[x][y];
        }
        int rightpath =0;
        int leftpath =0;

        if(x<m-1){
            rightpath = recursion(x+1,y,m,n,memo);
        }

        if(y<n-1){
            leftpath = recursion(x,y+1,m,n,memo);
        }
        memo[x][y]= rightpath+leftpath;
        return memo[x][y];
    }
}