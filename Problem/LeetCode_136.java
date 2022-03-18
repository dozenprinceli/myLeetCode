package Problem;

public class LeetCode_136 {
    public int singleNumber(int[] nums) {
        int num = 0;
        for (int j : nums) {
            num ^= j;
        }

        return num;
    }
}
