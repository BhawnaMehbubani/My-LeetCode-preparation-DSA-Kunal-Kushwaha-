//Optimised Solution
class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;    
         }   
         
        for(char i='a'; i<='z'; i++){
            if(sentence.indexOf(i) == -1) return false;
        }
        
        return true;
    }
}
//Bitwise Solution
/*class Solution {
    public boolean checkIfPangram(String sentence) {
        int res=0;
        for(int i=0;i<sentence.length();i++){
            res|=(1<<(sentence.charAt(i))-1);
            if(res==((1<<26)-1)){
                return true;
            }   
        }
        return false;
    }
}
*/

/*
//Brute force Solution
class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] arr=new boolean[26];
        for(int i=0;i<sentence.length();i++){
            arr[sentence.charAt(i)-97]=true;
        }
            for(int i=0;i<26;i++){
            if(arr[i]==false){
                return false;
            }
        }
        return true;
    }
}

*/

/*
//Brute force Solution
class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] alphabets={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] check=new int[26];
        for(int i=0;i<sentence.length();i++){
            for(int j=0;j<26;j++){
                if(sentence.charAt(i)==alphabets[j]){
                    check[j]++;
                }
            }
        }
        for(int i=0;i<26;i++){
            if(check[i]<1){
                return false;
            }
        }
        return true;
    }
}*/