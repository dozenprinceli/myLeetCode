package Problem;

public class LeetCode_11 {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            int vol = (right - left) * Math.min(height[left], height[right]);
            max = Math.max(vol, max);
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }

        return max;
    }
}
