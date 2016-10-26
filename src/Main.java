import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.LinkedList;

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
            int m = in.nextInt();
            int k = in.nextInt();
            LinkedList<Integer>[] Vertex = new LinkedList[n];
            int tot = 0;
            for (int i = 0; i < n; i++) {
                Vertex[i] = new LinkedList<>();
                Vertex[i].add(in.nextInt());
            }

            for (int i = 0; i < m; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                if (!Vertex[a].getFirst().equals(Vertex[b].getFirst())) {
                    Vertex[a].addAll(Vertex[b]);
                    Vertex[b].clear();
                }
            }
            for (int i = 0; i < Vertex.length; i++) {
                tot += 1;
            }
            out.print(tot);
        }

    }
}

