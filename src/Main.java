import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Marazzi Francesco
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long potions = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            long secs = in.nextInt();
            long mana = in.nextInt();
            long fts[] = new long[m + 1];
            long ftm[] = new long[m + 1];
            long sts[] = new long[k + 1];
            long stm[] = new long[k + 1];
            for (int i = 1; i <= m; i++) {
                fts[i] = in.nextInt();
            }
            for (int i = 1; i <= m; i++) {
                ftm[i] = in.nextInt();
            }
            for (int i = 1; i <= k; i++) {
                sts[i] = in.nextInt();
            }
            for (int i = 1; i <= k; i++) {
                stm[i] = in.nextInt();
            }
            fts[0] = secs;
            int l, h, mid;
            long tot = potions * secs, man;
            for (int i = 0; i <= m; i++) {
                man = mana - ftm[i];
                if (man < 0) continue;
                l = 0;
                h = k;
                while (l < h) {
                    mid = (l + h + 1) / 2;
                    if (stm[mid] <= man) l = mid;
                    else h = mid - 1;
                }
                tot = Math.min(tot, (potions - sts[l]) * fts[i]);
            }
            out.print(tot);
        }

    }
}

