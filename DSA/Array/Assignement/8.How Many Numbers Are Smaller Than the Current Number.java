//Optimized Solution
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res=new int[nums.length];
        int[] temp=new int[101];
        //frequency is stored
        for(int i=0;i<nums.length;i++){
            temp[nums[i]]++;
        }
        //calculating running sum
            for(int i=1;i<101;i++){
                temp[i]+=temp[i-1];
            }
         //storing ans
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                res[i]=0;
        
        else
            res[i]=temp[nums[i]-1];
    }

        
                   return res;
        
    }
}
//Brute Force Solution
/*class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if((j!=i)&&(nums[j]<nums[i])){
                    res[i]++;
                }
            }
        }
                   return res;
        
    }
}*/
