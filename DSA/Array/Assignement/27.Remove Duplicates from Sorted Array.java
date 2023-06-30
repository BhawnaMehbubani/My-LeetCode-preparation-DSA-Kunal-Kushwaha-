class Solution {
    public int removeDuplicates(int[] nums) {
        int j,i=0;
        for(j=0;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
        
    }
}
