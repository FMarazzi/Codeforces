package myPackage;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int max = (int)Math.ceil(Math.sqrt(b));
        int ops[] = new int[max];
        int x = b;
        int i = 0;
        while(x > a){
            if (x%2 == 0) {
                ops[i] = x;
                x = x/2;
                i++;
            }
            else if (x%10 == 1) {
                ops[i] = x;
                x = (x-1)/10;
                i++;
            }
            else {
                out.print("NO");
                return;
            }
        }
        if(x!=a) {
            out.print("NO");
            return;
        }
        out.print("YES\n");
        out.print((i+1)+"\n");
        out.print(a+" ");
        for (int j = i-1;j>=0;j--){
            out.print(ops[j]+" ");
        }
    }
}
