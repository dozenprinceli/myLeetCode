package Problem;

public class LeetCode_88 {
    public void merge(int[] nums1, int l1, int[] nums2, int l2) {
        int p1 = l1 - 1, p2 = l2 - 1;
        for (int i = l1 + l2 - 1; i > -1; i--) {
            if (p1 == -1) {
                nums1[i] = nums2[p2--];
                continue;
            }
            if (p2 == -1) return;

            nums1[i] = (nums1[p1] > nums2[p2]) ? nums1[p1--] : nums2[p2--];
        }
    }
}
