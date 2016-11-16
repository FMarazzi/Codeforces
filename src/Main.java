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
            int potions = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            int secs = in.nextInt();
            int mana = in.nextInt();
            int fts[] = new int[m];
            int ftm[] = new int[m];
            int sts[] = new int[k];
            int stm[] = new int[k];
            for (int i = 0; i < m; i++) {
                fts[i] = in.nextInt();
            }
            for (int i = 0; i < m; i++) {
                ftm[i] = in.nextInt();
            }
            for (int i = 0; i < k; i++) {
                sts[i] = in.nextInt();
            }
            for (int i = 0; i < k; i++) {
                stm[i] = in.nextInt();
            }
            int l, h, mid = 0;
            int tot = potions * secs, time, man;
            for (int i = 0; i < m; i++) {
                man = mana - ftm[i];
                if (man < 0) continue;
                if (stm[0] < man) {
                    l = 0;
                    h = k - 1;
                    while (l < h) {
                        mid = (l + h + 1) / 2;
                        if (stm[mid] <= man) l = mid;
                        else h = mid - 1;
                    }
                    time = (potions - sts[mid]) * fts[i];
                } else time = potions * fts[i];
                if (time < tot) tot = time;
            }
            out.print(tot);
        }

    }
}

