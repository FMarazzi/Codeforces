package myPackage;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int k = in.nextInt();
        int r = in.nextInt();
        int i=1;
        while((k*i)%10 != r && (k*i)%10 != 0)
            i++;
        out.print(i);
    }
}
