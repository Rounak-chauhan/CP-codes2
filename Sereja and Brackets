import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    
    static class Fast {
            BufferedReader br;
            StringTokenizer st;
 
            public Fast() {
                br = new BufferedReader(
                        new InputStreamReader(System.in));
            }
 
            String next() {
                while (st == null || !st.hasMoreElements()) {
                    try {
                        st = new StringTokenizer(br.readLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return st.nextToken();
            }
 
            int nextInt() {
                return Integer.parseInt(next());
            }
 
            long nextLong() {
                return Long.parseLong(next());
            }
 
            double nextDouble() {
                return Double.parseDouble(next());
            }
 
            int[] readArray(int n) {
                int a[] = new int[n];
                for (int i = 0; i < n; i++)
                    a[i] = nextInt();
                return a;
            }
 
            long[] readArray1(int n) {
                long a[] = new long[n];
                for (int i = 0; i < n; i++)
                    a[i] = nextLong();
                return a;
            }
 
            String nextLine() {
                String str = "";
                try {
                    str = br.readLine().trim();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return str;
            }
        }

    static class Info {
        int open;
        int close;
        int full;
        public Info(int open, int close, int full) {
            this.open = open;
            this.close = close;
            this.full = full;
        }
    }

    static class SegmentTree {
        Info[] seg;
        public SegmentTree(int size) {
            seg = new Info[size * 4];
        }
    
        //build min segment tree
        // public void buildMin(int[] nums, int lo, int hi, int idx) {
        //     if(lo == hi) {
        //         seg[idx] = nums[lo];
        //         return;
        //     }
            
        //     int mid = (lo + hi) / 2;
        //     buildMin(nums, lo, mid, 2 * idx + 1);
        //     buildMin(nums, mid + 1, hi, 2 * idx + 2);
        //     seg[idx] = Math.min(seg[2 * idx + 1], seg[2 * idx + 2]);
        // }
        
        // //build max segment tree
        // public void buildMax(int[] nums, int lo, int hi, int idx) {
        //     if(lo == hi) {
        //         seg[idx] = nums[lo];
        //         return;
        //     }
            
        //     int mid = (lo + hi) / 2;
        //     buildMax(nums, lo, mid, 2 * idx + 1);
        //     buildMax(nums, mid + 1, hi, 2 * idx + 2);
        //     seg[idx] = Math.max(seg[2 * idx + 1], seg[2 * idx + 2]);
        // }
        
        // //get minimum element in range query
        // public int getMin(int L, int R, int lo, int hi, int idx) {
            
        //     //no-overlap
        //     if(R < lo || L > hi) {
        //         return Integer.MAX_VALUE;
        //     }
            
        //     //complete-overlap
        //     if(lo >= L && hi <= R) {
        //         return seg[idx];
        //     }
            
        //     //partal overlap
        //     int mid = (lo + hi) / 2;
        //     int left = getMin(L, R, lo, mid, 2 * idx + 1);
        //     int right = getMin(L, R, mid + 1, hi, 2 * idx + 2);
        //     return Math.min(left, right);
        // }
        
        // //get max element in range query
        // public int getMax(int L, int R, int lo, int hi, int idx) {
            
        //     //no-overlap
        //     if(R < lo || L > hi) {
        //         return Integer.MIN_VALUE;
        //     }
            
        //     //complete-overlap
        //     if(lo >= L && hi <= R) {
        //         return seg[idx];
        //     }
            
        //     //partal overlap
        //     int mid = (lo + hi) / 2;
        //     int left = getMin(L, R, lo, mid, 2 * idx + 1);
        //     int right = getMin(L, R, mid + 1, hi, 2 * idx + 2);
        //     return Math.max(left, right);
        // }
        
        // //update for min
        // public void updateMin(int idx, int lo, int hi, int ui, int val) {
        //     if(lo == hi) {
        //         seg[idx] = val;
        //     }
            
        //     int mid = (lo + hi) / 2;
        //     if(ui <= mid) {
        //         updateMin(2 * idx + 1, lo, mid, ui, val);
        //     } else {
        //         updateMin(2 * idx + 2, mid + 1, hi, ui, val);
        //     }
            
        //     seg[idx] = Math.min(seg[2 * idx + 1], seg[2 * idx + 2]);
        // }
        
        // //update for max
        // public void updateMax(int idx, int lo, int hi, int ui, int val) {
        //     if(lo == hi) {
        //         seg[idx] = val;
        //         return;
        //     }
            
        //     int mid = (lo + hi) / 2;
        //     if(ui <= mid) {
        //         updateMax(2 * idx + 1, lo, mid, ui, val);
        //     } else {
        //         updateMax(2 * idx + 2, mid + 1, hi, ui, val);
        //     }
            
        //     seg[idx] = Math.max(seg[2 * idx + 1], seg[2 * idx + 2]);
        // }

        //build segment tree for Or,Xor,Or....
        // public void build(int[] arr, int lo, int hi, int op, int idx) {
        //     if(lo == hi) {
        //         seg[idx] = arr[lo];
        //         return;
        //     }

        //     int mid = (lo + hi) / 2;
        //     build(arr, lo, mid, op == 0 ? 1 : 0, 2 * idx + 1);
        //     build(arr, mid + 1, hi, op == 0 ? 1 : 0, 2 * idx + 2);

        //     if(op == 0) {
        //         seg[idx] = seg[2 * idx + 1] | seg[2 * idx + 2];
        //     } else {
        //         seg[idx] = seg[2 * idx + 1] ^ seg[2 * idx + 2];
        //     }
        // }

        // //update for xor,or,xor...
        // public void updateAndGetValue(int ui, int val, int idx, int op, int lo, int hi) {
        //     if(lo == hi) {
        //         seg[idx] = val;
        //         return;
        //     }

        //     int mid = (lo + hi) / 2;
        //     if(ui <= mid) {
        //         updateAndGetValue(ui, val, 2 * idx + 1, op == 0 ? 1 : 0, lo, mid);
        //     } else {
        //         updateAndGetValue(ui, val, 2 * idx + 2, op == 0 ? 1 : 0, mid + 1, hi);
        //     }

        //     if(op == 0) {
        //         seg[idx] = seg[2 * idx + 1] | seg[2 * idx + 2];
        //     } else {
        //         seg[idx] = seg[2 * idx + 1] ^ seg[2 * idx + 2];
        //     }
        // }

        public void build(String s, int lo, int hi, int si) {
            if(lo == hi) {
                if(s.charAt(lo) == '(')
                    seg[si] = new Info(1, 0, 0);
                else
                    seg[si] = new Info(0, 1, 0);
                return;
            }

            int mid = (lo + hi) / 2;
            build(s, lo, mid, si * 2 + 1);
            build(s, mid + 1, hi, si * 2 + 2);
            
            Info left = seg[si * 2 + 1], right = seg[si * 2 + 2];
            int combine = Math.min(left.open, right.close);
            int open = left.open + right.open - combine;
            int close = left.close + right.close - combine;
            int full = left.full + right.full + combine;

            seg[si] = new Info(open, close, full);
        }

        public Info getInfo(int lo, int hi, int si, int L, int R) {
            if(hi < L || lo > R) return new Info(0, 0, 0);
            if(lo >= L && hi <= R) return seg[si];
            
            int mid = (lo + hi) / 2;
            Info left = getInfo(lo, mid, si * 2 + 1, L, R);
            Info right = getInfo(mid + 1, hi, si * 2 + 2, L, R);
            
            int combine = Math.min(left.open, right.close);
            int open = left.open + right.open - combine;
            int close = left.close + right.close - combine;
            int full = left.full + right.full + combine;

            return new Info(open, close, full);
        }
    }
    public static void main(String[] args) {
        Fast sc = new Fast();
        PrintWriter out = new PrintWriter(System.out);
        String s = sc.next();
        int m = sc.nextInt();
        int n = s.length();
        
        SegmentTree st = new SegmentTree(n);
        st.build(s, 0, n - 1, 0);
        
        int[][] que = new int[m][2];

        for(int i = 0; i < m; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            que[i][0] = L - 1;
            que[i][1] = R - 1;
        }
        
        for(int i = 0; i < m; i++) {
            int L = que[i][0];
            int R = que[i][1];
            Info info = st.getInfo(0, n - 1, 0, L, R);
            out.println(info.full * 2);
        }
        out.close();
    }
}
