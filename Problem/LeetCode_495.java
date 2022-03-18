package Problem;

public class LeetCode_495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum = 0;
        int helper = 0;
        for (int i = 1; i < timeSeries.length; i++) {
            if (timeSeries[i] - timeSeries[i - 1] > duration) {
                sum += timeSeries[i - 1] - timeSeries[helper] + duration;
                helper = i;
            }
        }

        sum += timeSeries[timeSeries.length - 1] - timeSeries[helper] + duration;

        return sum;
    }
}
