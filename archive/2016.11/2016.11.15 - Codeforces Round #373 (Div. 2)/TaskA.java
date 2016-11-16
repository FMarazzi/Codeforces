package myPackage;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i =0;i<n;i++){
            a[i] = in.nextInt();
        }
        if(a[n-1] == 0) {out.print("UP"); return;}
        if(a[n-1] == 15) {out.print("DOWN"); return;}
        if (a.length < 2) {
            out.print(-1);
            return;
        }
        if(a[n-1]>a[n-2]) out.print("UP");
        else out.print("DOWN");
    }
}
