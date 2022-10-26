//Optimised Solution
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        LinkedList<Integer> res = new LinkedList<>();
        
        int remainder = k;
        for (int i = num.length - 1; i >= 0; i--) {
            remainder += num[i];
            res.addFirst(remainder % 10);
            remainder /= 10;
        }
        
        while (remainder > 0) {
            res.addFirst(remainder % 10);
            remainder /= 10;
        }
        
        return res;
        
    }
}
//Brute force solution
/*class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int n=num.length;
        int i=n-1;
        List <Integer> sol=new ArrayList<>();
        while(i>=0||k>0){
            if(i>=0){
                sol.add((num[i]+k)%10);
                k=(num[i]+k)/10;
            }
            else{
                sol.add(k%10);
                k/=10;
            }
            i--;
        }
        Collections.reverse(sol);
        return sol;
    }
}*/