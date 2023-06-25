class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int index = 1, ans = Integer.MIN_VALUE, len = points.length;
        int maxIndex = 0, maxNum = Integer.MIN_VALUE;
        int preIndex = 0, preNum = Integer.MIN_VALUE;

        for (int i = 0; i < len; i++) {
            int[] curs = points[i];
            while (index < len && points[index][0] - curs[0] <= k) {
                if (points[index][0] + points[index][1] >= maxNum) {
                    maxNum = points[index][0] + points[index][1];
                    maxIndex = index;
                } else if (points[index][0] + points[index][1] >= preNum) {
                    preNum = points[index][0] + points[index][1];
                    preIndex = index;
                }
                index++;
            }
            if (i >= maxIndex || maxNum <= preNum) {
                maxIndex = preIndex;
                maxNum = preNum;
                preNum = Integer.MIN_VALUE;
                preIndex = 0;
            }

            if (maxIndex > i) {
                ans = Math.max(ans, maxNum + curs[1] - curs[0]);
            }
        }
        return ans;
    }
    
}