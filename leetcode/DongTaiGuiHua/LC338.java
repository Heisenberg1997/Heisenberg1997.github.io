package DongTaiGuiHua;

/**
 * 计算1比特数多少
 * 最高位是1然后减去这个数 就是之前的数 可以用来做dp
 */

class LC338 {
    public int[] countBits(int n) {
        int[] bits = new int[n + 1];
        int highBit = 0;
        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0) {
                highBit = i;
            }
            bits[i] = bits[i - highBit] + 1;
        }
        return bits;
    }
}
