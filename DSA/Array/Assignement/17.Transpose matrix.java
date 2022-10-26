//Optimised solution
class Solution {
    public int[][] transpose(int[][] matrix) {
        //int m=matrix.length;
        //int n=matrix[0].length;
        int[][] ans=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                    ans [i][j]= matrix[j][i];
            }
        }
        return ans;
    }
}
//Brute force solution
class Solution {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] ans=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                    ans [i][j]= matrix[j][i];
            }
        }
        return ans;
    }
}