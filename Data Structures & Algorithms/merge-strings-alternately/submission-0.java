class Solution {
    public String mergeAlternately(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        int i=0;
        int j=0;

        while(i< s1.length() || j< s2.length()){
            if (i< s1.length()){
                result.append(s1.charAt(i));
                i++;
            }
            if (j < s2.length()){
                result.append(s2.charAt(j));
                j++;
            }
        }
        return result.toString();
    }
}