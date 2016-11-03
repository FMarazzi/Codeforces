package myPackage;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] left = new int[n];
        int[] right  = new int[n];
        int L=0,R=0,odiff=0;
        for(int i=0;i<n;i++){
            left[i] = in.nextInt();
            right[i] = in.nextInt();
            L += left[i];
            R += right[i];
        }
        odiff = Math.abs(L-R);
        int ndiff, index=0;
        for(int i=0;i<n;i++){
            ndiff = Math.abs((L+(right[i]-left[i]))-(R+(left[i]-right[i])));
            if (ndiff > odiff){
                index = i+1;
                odiff = ndiff;
            }
        }
        out.print(index);
    }
}
