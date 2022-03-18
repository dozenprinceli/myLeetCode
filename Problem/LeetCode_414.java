package Problem;

import java.util.TreeSet;

public class LeetCode_414 {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int n : nums) {
            set.add(n);
            if (set.size() > 3) {
                set.remove(set.first());
            }
        }

        return set.size() == 3 ? set.first() : set.last();
    }
}
