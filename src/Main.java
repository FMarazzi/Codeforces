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
            int n = in.nextInt();
            int w[] = new int[n];

            boolean e[] = new boolean[n];
            for (int i = 0; i < n; i++) {
                w[i] = in.nextInt();
                e[i] = false;
            }
            int k = in.nextInt();
            int ind[] = new int[n - k];
            char indc[] = new char[n - k];
            int actual, l = 0, m = 0, x = 0, a = 0, zo = 0;

            for (int i = 0; i < k; i++) {
                actual = in.nextInt();
                x = 0;
                while (x < actual) {
                    x += w[m];
                    m++;
                    if (m == n) break;
                }
                if (x != actual) {
                    out.print("NO");
                    return;
                }
                int z, zl = zo;
                for (int j = l; j < m; j++) {
                    if (w[j] == 0) {
                        zl++;
                        continue;
                    }
                    if (w[j] == actual) {
                        break;
                    }
                    z = -1;
                    while (j + z >= l && w[j + z] == 0) z--;
                    if (j + z >= l && w[j + z] > 0 && eat(w, j, z)) {
                        ind[a] = j - zl + 1;
                        indc[a] = 'L';
                        a++;
                        j = l - 1;
                        zl = zo;
                    } else {
                        z = 1;
                        while (j + z < m && w[j + z] == 0) z++;
                        if (j + z < m && w[j + z] > 0 && eat(w, j, z)) {
                            ind[a] = j - zl + 1;
                            indc[a] = 'R';
                            a++;
                            j = l - 1;
                            zl = zo;
                        }
                    }
                }
                if (a - zo != m - l - 1) {
                    out.print("NO");
                    return;
                }
                zo = m - l - 1;
                l = m;
            }
            out.print("YES\n");
            for (int i = 0; i < n - k; i++)
                out.print(ind[i] + " " + indc[i] + "\n");
        }

        boolean eat(int[] w, int l, int p) {
            if (w[l] > w[l + p]) {
                w[l] += w[l + p];
                w[l + p] = 0;
                return true;
            }
            return false;
        }

    }
}

