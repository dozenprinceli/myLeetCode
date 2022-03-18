package Problem;

public class LeetCode_35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left < right - 1) {
            int mid = (left + right) >> 1;

            if (target > nums[mid]) {
                left = mid;
                continue;
            }

            if (target < nums[mid]) {
                right = mid;
                continue;
            }

            if ((target ^ nums[mid]) == 0) {
                return mid;
            }
        }

        // Deprecated
        /* if (target <= nums[left]) return left;
        return (target <= nums[right]) ? right : right + 1; */

        return (target <= nums[left]) ? left : ((target <= nums[right]) ? right : right + 1);
    }
}
