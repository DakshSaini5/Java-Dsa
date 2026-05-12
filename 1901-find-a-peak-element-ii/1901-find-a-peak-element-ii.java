class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;     
        int n = mat[0].length;  


        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;       

            int maxRow = 0;
            for(int i = 0 ; i < m; i++){
                if(mat[i][mid] > mat[maxRow][mid]){
                    maxRow = i;
                }
            } 
            
            int left = -1;
            if (mid > 0) {
                left = mat[maxRow][mid - 1];
            }

            int right = -1;
            if (mid < n - 1) {
                right = mat[maxRow][mid + 1];
            }

            if(mat[maxRow][mid] > right && mat[maxRow][mid] > left){
                return new int[]{maxRow, mid};
            }
            else if(left > mat[maxRow][mid]){
                high = mid - 1; 
            }
            else {
                low = mid + 1; 
            }
        }
        
        return new int[]{-1, -1};
    }
}