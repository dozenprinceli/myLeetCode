package Problem;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> help = new ArrayList<>();
        List<Integer> new2 = new ArrayList<>();
        for (int i :nums2) {
            new2.add(i);
        }
        for (int i : nums1) {
            if (new2.contains(i) && !help.contains(i)) {
                help.add(i);
            }
        }

        int[] res = new int[help.size()];
        for (int i = 0; i < help.size(); i++) {
            res[i] = help.get(i);
        }

        return res;
    }
}
