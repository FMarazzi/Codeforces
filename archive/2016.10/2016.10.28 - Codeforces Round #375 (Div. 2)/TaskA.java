package myPackage;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int min=1000;
        for(int i=0;i<100;i++){
            int dist = Math.abs(a-i)+Math.abs(b-i)+Math.abs(c-i);
            if (dist < min) min = dist;

        }
        out.print(min);

    }
}
