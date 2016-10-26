package myPackage;



import java.util.Scanner;
import java.io.PrintWriter;

public class TaskD {
    public int n;
    public int m;
    public int k = 0;

    public boolean wcase(int[] d, int[] a, int l) {
        int b = l - m - k;
        boolean p[] = new boolean[m];
        for (int i = 0; i < m; i++) {
            p[i] = false;
        }
        if(b<0)
            return false;
        for(int i=l-1;i>=0;i--){
            if (d[i] != 0 && p[d[i] - 1] == false) {
                b += a[d[i]-1];
                p[d[i]-1] = true;
            }
            else if (d[i] != 0 && p[d[i] - 1] == true)
                b--;
            else
                b--;
            if(b<0)
                return false;
        }
        return true;
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        n = in.nextInt();
        m = in.nextInt();
        int d[] = new int[n];
        int a[] = new int[m];

        for (int i = 0; i < n; i++) {
            d[i] = in.nextInt();
        }
        for (int i = 0; i < m; i++) {
            a[i] = in.nextInt();
            k+=a[i];
        }
        int sup = n;
        int inf = 1;
        int x = sup;
        if(wcase(d,a,x)==false){
            out.print(-1);
            return;
        }
        while(sup-inf>1){
            x = (sup + inf)/2;
            if(wcase(d,a,x))
                sup = x;
            else
                inf = x;
        }
        out.print(sup);
    }
}