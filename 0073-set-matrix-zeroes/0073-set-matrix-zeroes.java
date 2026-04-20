class Solution {
    public void setZeroes(int[][] matrix) {
        int m =matrix.length;
        int n = matrix[0].length;

        boolean[] c0 = new boolean[m];
        boolean[] b0 = new boolean[n];
        for(int i = 0;i<m;i++){
            for(int j =0;j<n;j++){
                if(matrix[i][j] == 0){
                    c0[i]=true;
                    b0[j]=true;
                }
            }
        }
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(c0[i]||b0[j]){
                    matrix[i][j] =0;
                }
            }
        }
    }
}