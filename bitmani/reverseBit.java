package bitmani;

public class reverseBit {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            // Extract the LSB of n
            int bit = (n >> i) & 1;
            // Place it in the reversed position
            result = result | (bit << (31 - i));
        }
        return result;
    }
}