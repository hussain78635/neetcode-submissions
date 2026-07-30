class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left =1;
        int right = 0;
        for(int pile : piles){
            right = Math.max(right, pile);
        }
        
        int res = right;
        while(left <= right){
            int mid = (left+right)/2;
            long totalHours = 0;
            for(int pile : piles){
                totalHours +=(long) Math.ceil((double) pile/  mid);
            }
            if(totalHours <= h){
                res = mid;
                right = mid-1;
            }else{
                left= mid+1;
            }
        }
        return res;
    }
}
