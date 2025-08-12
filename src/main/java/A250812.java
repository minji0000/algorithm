package main.java;

import java.util.Scanner;

public class A250812 {
    public static int solution(int N, int[] waters) {
        int count = 0;  // 작업 횟수를 카운트

        // 모든 물통이 비워질 때까지 반복
        for (int i = 0; i < N-1; i++) {
            if (waters[i] > 0) {
                if (waters[i] < waters[i + 1]) { // (A) 현재 물 양이 다음 것 보다 적은 경우
                    waters[i+1] -= waters[i];
                    waters[i] = 0;
                    count++;
                } else {
                    // 현재 물통이 더 많은 경우
                    waters[i] = 0;
                    count++;
                }
            }
        }
        // 마지막 물통 처리
        if (waters[N-1] > 0) {
            //마지막 물통에 물이 남았는지 확인, 앞의 for문을 보면 마지막 물통을 확인하고 있지 않아서 여기서 확인
            waters[N-1] = 0;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 처리
        //물통의 갯수
        int N = sc.nextInt();
        //각각의 물통에 든 물의 양
        int[] waters = new int[N];

        for (int i = 0; i < N; i++) {
            waters[i] = sc.nextInt();
        }

        // 결과 출력
        System.out.println(solution(N, waters));
        sc.close();
    }
}
