class Solution {
    public int[] sortedSquares(int[] nums) {
         int n = nums.length;
         int[] res = new int[n];
         int left=0,right=n-1,i=n-1;
         while(left<= right){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];


            if(leftSquare > rightSquare){
                res[i] = leftSquare;
                left++;
            }else{
                res[i] = rightSquare;
                right--;
            }
            i--;
         }
         return res;
    }
}