package myPackage;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long d[] = new long[3];
        long dn[] = new long[3];
        long min;
        for (int i = 0; i<3; i++) {
            d[i] = in.nextLong();
            dn[i] = d[i];
        }
        /*min = Math.min(Math.min(d[0],d[1]), d[2]);
        for (int i = 0; i<3; i++) {
            d[i]
        }  */

        if (d[0] >= d[1] && d[0] >= d[2]) dn[0]--;
        if (d[1] >= d[0] && d[1] >= d[2]) dn[1]--;
        if (d[2] >= d[0] && d[2] >= d[1]) dn[2]--;
        if (dn[0] >= dn[1] && dn[0] >= dn[2]) out.print((dn[0]-dn[1])+(dn[0]-dn[2]));
        else {
            if (dn[1] >= dn[0] && dn[1] >= dn[2]) out.print((dn[1]-dn[0])+(dn[1]-dn[2]));
            else if (dn[2] >= dn[0] && dn[2] >= dn[1]) out.print((dn[2]-dn[1])+(dn[2]-dn[0]));
        }
    }
}
