//Optimised Solution
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int [] row : image) {
            for(int i = 0; i < (image[0].length + 1)/2;i++) {
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length -i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;
            }
            }
        return image;
        
    }


//Brute force solution
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int m=image.length;
        int n=image[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<(n+1)/2;j++){
                int temp=image[i][j]^1;
                image[i][j]=image[i][n-j-1]^1;
                image[i][n-j-1]=temp;
            }
        }
        return image;
    }
}