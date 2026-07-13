class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int totalNumberOfSubArray = 0;
        int currentSum = 0;
        int left = 0;
        for (int i=0;i<arr.length;i++){
            currentSum += arr[i];
            if(i - left + 1 > k){
                currentSum -= arr[left];
                left++;
            }
            if(i- left + 1 ==  k){
                if((double)currentSum / k >= threshold){
                    totalNumberOfSubArray++;
                }
            }
        }
        return totalNumberOfSubArray;
    }
}