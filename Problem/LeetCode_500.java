package Problem;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_500 {
    @SuppressWarnings("SpellCheckingInspection")
    private static final String[] ROW = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};

    public String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();
        for (String wordOri : words) {
            String word = wordOri.toLowerCase();
            char firstChar = word.charAt(0);
            for (String s : ROW) {
                if (s.contains(String.valueOf(firstChar))) {
                    for (int i = 0; i < word.length(); i++) {
                        if (!s.contains(String.valueOf(word.charAt(i)))) break;
                        if (i == word.length() - 1) res.add(wordOri);
                    }

                    break;
                }
            }
        }

        String[] resStr = new String[res.size()];
        return res.toArray(resStr);
    }
}
