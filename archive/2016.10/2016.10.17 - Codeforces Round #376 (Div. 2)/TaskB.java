package myPackage;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int days = in.nextInt();
        int pizzas[] = new int[days];
        for (int i = 0; i<days;i++){
            pizzas[i] = in.nextInt();
        }
        for (int i = 0; i<days;i++){
            pizzas[i] %= 2;
            if (i == days-1){
                if (pizzas[i] > 0) out.print("NO");
                else out.print("YES");
                return;
            }
            pizzas[i+1] -= pizzas[i];
            if (pizzas[i+1] < 0) {
                out.print("NO");
                return;
            }
        }
    }
}
