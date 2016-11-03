package myPackage;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[m+1];
        int queue[] = new int[n];
        int change[] = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = in.nextInt();
            if (a[i]<=m) b[a[i]]++;
        }
        int minmax = n/m;
        int q=0,c=0;
        for (int i=0;i<n;i++){
            if(a[i]>m){
                queue[q] = i;
                q++;
            }
            else if (b[a[i]]>minmax) {
                b[a[i]]--;
                queue[q] = i;
                q++;
            }
            else if(b[a[i]]< minmax) {
                b[a[i]]++;
                change[c] = i;
                c++;
            }
        }
        for (int i=0;i<c;i++){
            a[queue[i]] = a[change[i]];
        }
        for (int i=1;i<=m;i++){
            while(b[i]<minmax && q>0){
                a[queue[q-1]] = i;
                b[i]++;
                q--;
                c++;
            }
        }
        out.print(minmax+" "+c+"\n");
        for (int i=0;i<n;i++) {
            out.print(a[i]+" ");
        }
    }
}
