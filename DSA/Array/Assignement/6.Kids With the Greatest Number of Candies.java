class Solution {
 /*  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int i,j,temp,flag=0;
        for(i=0;i<candies.length;i++){
            flag=0;
            temp=candies[i]+extraCandies;
            for(j=i+1;j<candies.length;j++){
                if(temp>=candies[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==1)
                result.add(true);
            else
                result.add(false);
            
        }
        return result;
    }
}*/
public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        
        for(int i: candies)
            max = i>max? i:max;
        List<Boolean> bools = new ArrayList<>();
        
        for(int i=0; i<candies.length ; i++){
            candies[i] += extraCandies;
            if(candies[i] < max)
                bools.add(false);
            else
                bools.add(true);
        }
        return bools;
    }
}
    
