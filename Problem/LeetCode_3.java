package Problem;

import java.util.HashMap;

public class LeetCode_3 {
    public int lengthOfLongestSubstring(String s) {
        // 第一次的写法，逻辑过于复杂，时间和空间复杂度较高
        /* if (s.equals("")) return 0;

        int subLength = 1;
        String subStr = String.valueOf(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char indexChar = s.charAt(i);

            if (subStr.contains(String.valueOf(indexChar))) {
                if (subLength <= subStr.length()) {
                    subLength = subStr.length();
                }

                int indexSubStr = subStr.indexOf(indexChar);
                subStr = s.substring(i - (subStr.length() - indexSubStr - 1), i + 1);
            } else {
                subStr = subStr + indexChar;
            }
        }

        return (subLength <= subStr.length()) ? subStr.length() : subLength; */

        // 改进的解法
        HashMap<Character, Integer> charMap = new HashMap<>();
        int start = 0, max = 0;

        for (int end = 0; end < s.length(); end++) {
            char indexChar = s.charAt(end);
            if (charMap.containsKey(indexChar)) {
                // 若包含的字符在start之前，则不变
                start = Math.max(charMap.get(indexChar) + 1, start);
            }

            charMap.put(indexChar, end);
            max = Math.max(max, end - start + 1);
        }

        return max;
    }
}
