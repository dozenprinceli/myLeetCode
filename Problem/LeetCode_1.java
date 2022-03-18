package Problem;

public class LeetCode_1 {
    public int[] twoSum(int[] nums, int target) {
        int[] indexArray = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indexArray[0] = i;
                    indexArray[1] = j;
                }
            }
        }

        return indexArray;
    }
}
