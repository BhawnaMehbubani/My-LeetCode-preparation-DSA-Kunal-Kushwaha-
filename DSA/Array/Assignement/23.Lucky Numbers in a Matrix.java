//Optimised solution2
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
       
       
        List<Integer> res=new ArrayList<>();
       
        
        for(int i=0;i<matrix.length;i++)
        {
           int minColIndex=minInRow(matrix,i);
           int value=matrix[i][minColIndex];
           if(checkIfMaxInCol(matrix,minColIndex,value))
           {
               res.add(value);
           }
        }
        
        return res;
       
    }
    
    private int minInRow(int[][] matrix,int row)
    {
        int minIndex=0,min=matrix[row][0];
        for(int j=0;j<matrix[0].length;j++)
        {
            if(matrix[row][j]<min)
            {
                 min=matrix[row][j];
                minIndex=j;
            }
           
        }
        return minIndex;
    }
    
    private boolean checkIfMaxInCol(int[][] matrix,int col,int value)
    {
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][col]>value)
            {
                return false;
            }
        }
        return true;
    }
}
//Optimised solution1
/*class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List <Integer> arr=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int minIdex=0;
            int min=Integer.MAX_VALUE;
            for(int j=0;j<matrix[i].length;j++){

                if(matrix[i][j]<min){
                min=matrix[i][j];
                minIdex=j;
                }
            }
            boolean isTrue=true;
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][minIdex]<matrix[j][minIdex]){
                    isTrue=false;
                    break;
                }
            }
            if(isTrue){
                arr.add(matrix[i][minIdex]);
            }
        }
        return arr;

    }
}*/