package Problem;

import java.util.Arrays;

public class LeetCode_455 {
    public int findContentChildren(int[] kid, int[] size) {
        Arrays.sort(kid);
        Arrays.sort(size);

        int res = 0, index = 0;
        for (int k : kid) {
            while(index < size.length && k > size[index]) {
                index++;
            }

            if (index >= size.length) break;

            res++;
            index++;
        }

        return res;
    }
}
