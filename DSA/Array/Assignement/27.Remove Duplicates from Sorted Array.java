class Solution {
    public int removeDuplicates(int[] nums) {
        int i,rd=0;
        for(i=0;i<nums.length;i++){
            if(nums[rd]!=nums[i]){
                rd++;
                nums[rd]=nums[i];
            }
        }
        return rd+1;
        
    }
}