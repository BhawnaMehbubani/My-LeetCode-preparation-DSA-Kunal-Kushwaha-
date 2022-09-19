class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int s=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                s+=accounts[i][j];
                
            }
            if(s>max){
                max=s;
            }
            s=0;
        }
        return max;
        
    }
}
