class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m  = mat.length;
        int n = mat[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int current = mat[i][j];
           
                int top = -1;
                if(i > 0){
                    top = mat[i-1][j];
                }
                int bottom = -1;
                if(i < m -1){
                    bottom = mat[i+1][j];
                }
                int left = -1;
                if(j > 0){
                    left = mat[i][j-1];
                }
                int right = -1;
                if(j < n-1){
                    right = mat[i][j+1];
                }
                if(current > top && current > bottom && current > left && current > right){
                return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}