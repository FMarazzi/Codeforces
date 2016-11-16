package myPackage;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] l = new int[101];
        int best=0,worst=0,toterr=0;

        for (int i = 0; i < n; i++) {
            l[in.next().length()]++;
        }
        int rl = in.next().length();
        for(int i=0;i<rl;i++){
            toterr+=l[i];
        }
        best=calc(toterr,k)+1;
        worst=calc(toterr+(l[rl]-1),k)+1;

        out.print(best+" "+worst);
    }
    int calc(int err,int k){
        return (err/k)*5+err;
    }
}
