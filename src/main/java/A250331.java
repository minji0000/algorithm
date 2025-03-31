package main.java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//내일 분석할 알고리즘
class Edge implements Comparable<Edge> {
        int src, dest, weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }

        public int compareTo(Edge compareEdge) {
            return this.weight - compareEdge.weight;
        }
    }

    public class Main {
        static int[] parent;

        static int find(int i) {
            if (parent[i] == i) {
                return i;
            } else {
                parent[i] = find(parent[i]);
                return parent[i];
            }
        }

        static void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX != rootY) {
                parent[rootY] = rootX;
            }
        }

        public static void main(String[] args) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st;

                int N = Integer.parseInt(br.readLine().trim());
                int M = Integer.parseInt(br.readLine().trim());

                List<Edge> edges = new ArrayList<>();

                for (int i = 0; i < M; i++) {
                    st = new StringTokenizer(br.readLine().trim());
                    int A = Integer.parseInt(st.nextToken());
                    int B = Integer.parseInt(st.nextToken());
                    int C = Integer.parseInt(st.nextToken());
                    edges.add(new Edge(A - 1, B - 1, C));
                }

                // 최소신장트리(MST)는 가중치의 합이 최소가되는 트리로 가중치가 작은 간선부터 연결해요!
                ____

                        parent = new int[N];
                for (int i = 0; i < N; i++) {
                    parent[i] = i;
                }

                int mstWeight = 0;
                for (Edge edge : edges) {
                    int x = find(edge.src);
                    int y = find(edge.dest);

                    // 만약 간선의 양쪽 노드가 서로다른 집합에 속해 있다면
                    if (____) {
                        union(x, y);
                        mstWeight += edge.weight;
                    }
                }

                System.out.println(mstWeight);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
