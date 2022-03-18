package Problem;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_119 {
    public List<Integer> getRow(int rowIndex) {
        // 第一次的解法，利用递归，但时间复杂度过高
        /*List<Integer> lst = new ArrayList<>(rowIndex + 1);
        for (int i = 0; i < rowIndex + 1; i++) {
            if (i == 0 || i == rowIndex) {
                lst.add(1);
            } else {
                List<Integer> pre = getRow(rowIndex - 1);
                lst.add(pre.get(i - 1) + pre.get(i));
            }
        }

        return lst;*/

        // 改进的写法，时间复杂度O(rowIndex²)，空间复杂度O(1)
        List<Integer> lst = new ArrayList<>();
        lst.add(1);

        for (int i = 0; i < rowIndex; i++) {
            lst.add(0);
            for (int col = i + 1; col > 0; col--) {
                lst.set(col, lst.get(col - 1) + lst.get(col));
            }
        }

        return lst;

        // 另一种时间复杂度O(rowIndex)的写法
        // 利用杨辉三角的通项公式（利用组合式C_{n}^{m}），维护一个rowIndex长度的组合数进行递推计算
    }
}
