package Problem;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lst = new ArrayList<>(numRows);
        List<Integer> pre = new ArrayList<>(1);
        pre.add(1);
        lst.add(pre);

        for (int row = 2; row <= numRows; row++) {
            List<Integer> cur = new ArrayList<>(row);
            for (int col = 0; col < row; col++) {
                if (col == 0 || col == row - 1) {
                    cur.add(1);
                } else {
                    cur.add(pre.get(col - 1) + pre.get(col));
                }
            }
            lst.add(cur);
            pre = cur;
        }

        return lst;
    }
}
