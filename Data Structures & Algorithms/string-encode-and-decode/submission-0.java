
class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }

            int length = 0;
            for (int k = i; k < j; k++) {
                length = length * 10 + (str.charAt(k) - '0');
            }

            i = j + 1;
            res.add(str.substring(i, i + length));
            i += length;
        }

        return res;
    }
}