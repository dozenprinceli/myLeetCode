package Problem;

import java.util.HashSet;

public class LeetCode_217 {
    public boolean containsDuplicate(int[] nums) {
        // 看题解思路后顿悟了，暴露了对于哈希表之类的集合类运用不熟练
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) return true;
            set.add(i);
        }

        return false;
    }
}
