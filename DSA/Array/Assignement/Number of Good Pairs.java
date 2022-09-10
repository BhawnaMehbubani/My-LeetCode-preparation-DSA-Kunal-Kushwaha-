//Optimzed Solution
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] temp=new int[101];

        int res=0;
        for(int i=0;i<nums.length;i++){
            res+=temp[nums[i]];
            temp[nums[i]]++;
        }
        return res;
        
    }
}
//Brute force solution
/*class Solution {
    public int numIdenticalPairs(int[] nums) {
        in ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length.j++){
                if(nums[i]==nums[j]){
                    ans++;
                }
            }
        }
        }
        return ans;
        
    }
}*/

