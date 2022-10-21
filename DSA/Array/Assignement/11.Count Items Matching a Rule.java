//Optimised Solution
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int a, b, c, i=0;
        String s;
        if(ruleKey.equals("type"))
            a=0;
        else if(ruleKey.equals("color"))
            a=1;
        else if(ruleKey.equals("name"))
            a=2;
        else 
            return 0;
        int l=items.size();
        for(int x=0;x<l;x++){
            s=items.get(x).get(a);
            if(s.equals(ruleValue))
                i++;
        }
        return i;
    }
}
//Brute force Solution
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans=0;
        if(ruleKey.equals("type")){
            for(int i=0; i<items.size();i++){
                if(items.get(i).get(0).equals(ruleValue)){
                    ans++;
                }
            }
        }
        else if(ruleKey.equals("color")){
            for(int i=0; i<items.size();i++){
                if(items.get(i).get(1).equals(ruleValue)){
                    ans++;
                }
            }
        }
        else{

        
            for(int i=0; i<items.size();i++){
                if(items.get(i).get(2).equals(ruleValue)){
                    ans++;
                }
            }
        }
            return ans;
    }

}