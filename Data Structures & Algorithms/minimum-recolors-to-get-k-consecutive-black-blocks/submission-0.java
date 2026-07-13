class Solution {
    public int minimumRecolors(String blocks, int k) {
        int currentWhites= 0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i) ==  'W'){
                currentWhites++;
            }
        }
        int minRecolors = currentWhites;
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(i) == 'W'){
                currentWhites++;
            }
            if(blocks.charAt(i-k) == 'W'){
                currentWhites--;           
            }
            minRecolors = Math.min(minRecolors, currentWhites);
        }
        return minRecolors;
    }
}