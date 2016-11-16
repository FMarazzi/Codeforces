package myPackage;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int tot=0;
        while(a>0 && c>0 && d>0){
            tot+=256;
            a--;
            c--;
            d--;
        }
        while(a>0 && b>0){
            tot+=32;
            a--;
            b--;
        }
        out.print(tot);
    }
}
