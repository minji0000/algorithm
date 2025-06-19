package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//어려운 알고리즘만 풀다가 쉬운 거 푸니까 꾸준히 풀 수 있는 느낌 들어서 오히려 좋아..!
public class A250617 {

    static boolean[] used;
    static List<Integer> current;
    static int N;

    public static void generatePermutations(int n) {
        N = n;

        used = new boolean[n];
        current = new ArrayList<>();
        backtrack();
    }

    private static void backtrack() {
        if (current.size() == N) {  // 순열 완성 조건
            for (int num : current) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!used[i]) {  // 숫자 사용 여부 확인
                used[i] = true;
                current.add(i + 1);  // 현재 순열에 숫자 추가
                backtrack();
                current.remove(current.size() - 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        generatePermutations(n);
    }

}
