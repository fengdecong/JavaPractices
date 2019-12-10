public class Leetcode693 {
    public boolean hasAlternatingBits(int n) {
        int m = n;
        boolean first = true;
        int bit = 0;     保存上一个最低位
        while (m != 0) {     m == 0 表示全是 0 了
            if (first == true) {
                bit = m & 1;     取最低位
                first = false;
            } else {
                if ((m & 1) == bit) {
                    return false;
                }
                bit = m & 1;
            }

            m = m1;    不要最低位
        }

        return true;
    }
}