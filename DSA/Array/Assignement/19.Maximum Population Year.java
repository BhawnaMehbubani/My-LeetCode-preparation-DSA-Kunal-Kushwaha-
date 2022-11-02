//Optimised solution
class Solution {
    public int maximumPopulation(int[][] logs) {
        int [] arr=new int[101];
        for(int i=0;i<logs.length;i++){
 
                arr[logs[i][0]-1950]++;
                arr[logs[i][1]-1950]--;
            
        }
        //running sum
        for(int i=1;i<101;i++){
            arr[i]+=arr[i-1];

        }
        int maxyear=1950;
        int maxvalue=0;
        for (int i=0;i<101;i++){
            if(arr[i]>maxvalue){
                maxvalue=arr[i];
                maxyear=i+1950;
            }
        }
        
        return maxyear;
    }
}
//Brute force solution
class Solution {
    public int maximumPopulation(int[][] logs) {
        int [] arr=new int[101];
        for(int i=0;i<logs.length;i++){
            for(int j=logs[i][0];j<logs[i][1];j++){
                arr[j-1950]++;
            }
        }
        int maxyear=1950;
        int maxvalue=0;
        for (int i=0;i<101;i++){
            if(arr[i]>maxvalue){
                maxvalue=arr[i];
                maxyear=i+1950;
            }
        }
        
        return maxyear;
    }
}