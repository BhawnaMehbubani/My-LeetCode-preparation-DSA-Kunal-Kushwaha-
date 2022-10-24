//Optimised solution2
class Solution {
    public int findNumbers(int[] nums) {
        int i=0;
        int count =0;
        while (i<nums.length){
            if(isEven(nums[i])){
                count++;
            }
            i++;
        }
        return count;
    }
    
    private boolean isEven(int input){
        if (input>=10 && input<=99){
            return true;
        }
        if (input>=1000 && input<=9999){
            return true;
        }
        if (input==100000){
            return true;
        }
        return false;
    }
}
//Optimised solution1
/*class Solution {
    public int findNumbers(int[] nums) {
        int digits;
        int count=0;
        for(int i=0;i<nums.length;i++){
            digits=(int)Math.log10(nums[i])+1;
            if(digits%2==0)
                count++;
        }
        return count;
    }
}*/

//Brute force solution
/*class Solution {
    public int findNumbers(int[] nums) {
        int[] digits=new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=0){
                digits[i]++;
                //t=nums[i]%10;
                nums[i]/=10;
            }
            if(digits[i]%2==0)
                count++;
        }
        return count;
    }
}*/
