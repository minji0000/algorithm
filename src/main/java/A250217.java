package main.java;

import java.util.ArrayList;
import java.util.List;

public class A250217 {
    /**
     * 출력 형식
     * 1. 첫째 줄부터 N!개의 줄에 걸쳐 모든 순열을 사전순으로 출력합니다.
     * 2. 각 줄에는 1부터 N까지의 수를 공백으로 구분하여 출력합니다.
     *
     * 예제 입력 : 3
     *
     * 예제 출력
     * 1 2 3
     * 1 3 2
     * 2 1 3
     * 2 3 1
     * 3 1 2
     * 3 2 1
     */

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

}
