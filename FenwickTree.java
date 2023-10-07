import java.util.*;

public class BIT {
    static final int N = 100010;
    static int[] bit = new int[N];

    static void update(int i, int x) {
        for (; i < N; i += (i & -i)) {
            bit[i] += x;
        }
    }

    static int sum(int i) {
        int ans = 0;
        for (; i > 0; i -= (i & -i)) {
            ans += bit[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        // Your main code here
    }
}
