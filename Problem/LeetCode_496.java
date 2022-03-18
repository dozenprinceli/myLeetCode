package Problem;

public class LeetCode_496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int index = 0;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    index = j;
                    break;
                }
            }

            int j = index + 1;
            for (; j < nums2.length; j++) {
                if (nums2[j] > nums2[index]) {
                    nums[i] = nums2[j];
                    break;
                }
            }
            if (j == nums2.length) nums[i] = -1;
        }

        return nums;
    }
}
