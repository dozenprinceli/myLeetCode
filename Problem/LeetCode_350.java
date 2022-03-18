package Problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            map.put(i, map.containsKey(i) ? map.get(i) + 1 : 1);
        }

        List<Integer> lst = new ArrayList<>();
        for (int j : nums2) {
            if (map.containsKey(j) && map.get(j) > 0) {
                lst.add(j);
                map.replace(j, map.get(j) - 1);
            }
        }

        return lst.stream().mapToInt(Integer::intValue).toArray();
    }
}
