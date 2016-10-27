package myPackage;

import java.util.*;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int tot=0;
        int[][] sets = new int[n][m];
        DisjointSets DJS = new DisjointSets();
        for(int i=0;i<n;i++) {
            // Create a set for each sock
            sets[i] = DJS.createSets(1);
        }

        for(int i=0;i<m;i++) {
            // Each day, unite two sets: unite(a,b)
            int a = in.nextInt()-1;
            int b = in.nextInt()-1;
            DJS.unite(sets,a,b);
        }
        // Once you have all the sets, for each set calculate how many socks you have to change color
        for (int i =0;i<Vertex.length;i++){
            tot+=1;
        }
        out.print(tot);
    }

    public class DisjointSets {
        int[] createSets(int size) {
            int[] p = new int[size];
            for (int i = 0; i < size; i++)
                p[i] = i;
            return p;
        }

        int root(int[] p, int x) {
            return x == p[x] ? x : (p[x] = root(p, p[x]));
        }

        void unite(int[] p, int a, int b) {
            a = root(p, a);
            b = root(p, b);
            if (a != b)
                p[a] = b;
        }

        /*// Usage example
        public static void main(String[] args) {
            int[] p = createSets(10);
            System.out.println(false == (root(p, 0) == root(p, 9)));
            unite(p, 0, 9);
            System.out.println(true == (root(p, 0) == root(p, 9)));
        }*/
    }
}
