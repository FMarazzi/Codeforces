package myPackage;

import java.util.*;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int sets=0;
        int tot=0;
        int[] socks = new int[n];
        int[] sock_set = new int[n];
        int[] ranks = new int[n];
        for(int i=0;i<n;i++) {
            socks[i] = in.nextInt()-1;
            sock_set[i] = -1;
        }
        for(int i=0;i<m;i++) {
            int a = in.nextInt()-1;
            int b = in.nextInt()-1;
            if (sock_set[a] == -1) sock_set[a] = a;
            if (sock_set[b] == -1) sock_set[b] = b;
            unite(sock_set,ranks,a,b);
            sets++;
        }
        // Once you have all the sets, for each set calculate how many socks you have to change color
        int max[] = new int[sets];
        int parent;
        int[][] colours = new int[sets][k];
        for (int i=0;i<n;i++){
            parent = find(sock_set, i);
            if (parent >= 0) {
                colours[parent][socks[i]]++;
                tot++;
                if (colours[parent][socks[i]] > max[parent])
                    max[parent] = colours[parent][socks[i]];
            }
        }
        for (int i=0;i<n;i++)
            tot -= max[i];
        out.print(tot);
    }

    int find(int[] parent, int i)
    {
        if (i<0) return -1;
        if (parent[i] != i)
            parent[i] = find(parent, parent[i]);
        return parent[i];
    }

    void unite(int[] parent, int[] rank, int x, int y)
    {
        int x_root = find(parent, x);
        int y_root = find(parent, y);
        if (x_root != y_root) {
            if (rank[x_root] < rank[y_root])
                parent[x_root] = y_root;
            else if (rank[x_root] > rank[y_root])
                parent[y_root] = x_root;
            else {
                parent[y_root] = x_root;
                rank[x_root]++;
            }
        }
    }
}
