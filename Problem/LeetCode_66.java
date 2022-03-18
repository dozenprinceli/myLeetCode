package Problem;

public class LeetCode_66 {
    public int[] plusOne(int[] digits) {
        // 第一次写法，判断条件过多，过于繁琐
        /*int length = digits.length;
        if ((digits[length - 1] ^ 9) == 0) {
            for (int i = 0; i < length; i++) {
                if (digits[i] != 9) {
                    break;
                }

                if (i == length - 1) {
                    int[] plus = new int[length + 1];
                    plus[0] = 1;
                    return plus;
                }
            }

            int carry = 1;
            for (int i = length - 1; i > -1; i--) {
                int help = digits[i] + carry;
                digits[i] = help % 10;
                carry = help / 10;
            }
        } else {
            digits[length - 1] += 1;
        }

        return digits;*/

        // 改进的写法
        for (int i = digits.length - 1; i > -1; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0) return digits;
        }

        int[] plus = new int[digits.length + 1];
        plus[0] = 1;
        return plus;
    }
}
