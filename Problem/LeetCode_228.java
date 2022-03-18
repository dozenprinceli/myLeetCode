package Problem;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        int left = 0, right = 0;
        while (right < nums.length) {
            if (right == nums.length - 1) {
                res.add(helper(nums, left, right));
                break;
            }

            if (nums[right + 1] - nums[right] == 1) {
                right++;
            } else {
                res.add(helper(nums, left, right));
                left = ++right;
            }
        }

        return res;
    }

    public String helper(int[] nums, int left, int right) {
        if (left == right) {
            return new String("" + nums[left]);
        } else {
            return new String("" + nums[left] + "->" + nums[right]);
        }
    }
}
