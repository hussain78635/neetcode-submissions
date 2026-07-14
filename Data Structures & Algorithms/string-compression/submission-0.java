class Solution {
    public int compress(char[] chars) {
        int write = 0;
        int i = 0;
        while(i < chars.length){
            int j = i;
            while(j<chars.length && chars[j] == chars[i]){
                j++;
            }
            chars[write++] = chars[i];

            int count = j-i;
            if(count > 1){
                for(char c: Integer.toString(count).toCharArray()){
                    chars[write++] = c;
                }
            }
            i = j;
        }
        return write;
    }
}