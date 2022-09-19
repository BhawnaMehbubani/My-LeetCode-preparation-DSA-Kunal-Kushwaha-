//Brute force Solution
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] targetArray=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>index[i];j--){
                targetArray[j]=targetArray[j-1];
            }
            targetArray[index[i]]=nums[i];
        }
        return targetArray;
    }
}
//Optimised Solution
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] targetArray=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            for(int j=i;j>index[i];j--){
                targetArray[j]=targetArray[j-1];
            }
            targetArray[index[i]]=nums[i];
        }
        return targetArray;
    }
}