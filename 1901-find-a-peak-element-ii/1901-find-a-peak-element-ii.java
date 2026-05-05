class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){

                int current = mat[i][j];
                boolean isPeak = true;

                if(i - 1 >= 0 && mat[i - 1][j] >= current){
                    isPeak = false;
                }
                if(i + 1 < m && mat[i + 1][j] >= current){
                    isPeak = false;
                }
                if(j - 1 >= 0 && mat[i][j - 1] >= current){
                    isPeak = false;
                }
                if(j + 1 < n && mat[i][j + 1] >= current){
                    isPeak = false;
                }

                if(isPeak){
                    return new int []{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}