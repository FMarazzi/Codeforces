package myPackage;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int tot=0;
        int[] walks = new int[n];
        for (int i=0;i<n;i++)
            walks[i] = in.nextInt();
        int p = walks[0];
        for(int i=1;i<n;i++) {
            if (walks[i] + p >= k) {
                p = walks[i];
                continue;
            }
            tot += k-p-walks[i];
            walks[i] += k-p-walks[i];
            p = walks[i];
        }
        out.println(tot);
        for(int i=0;i<n;i++) {
            out.print(walks[i]);
            out.print(" ");
        }
    }
}
