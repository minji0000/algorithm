package main.java;

import java.util.Scanner;

public class A250225 {

    // 자릿수의 합을 계산하는 함수
    private static int digitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int n = scanner.nextInt();
        scanner.close();

        int result = 0;

        // 생성자 찾기
        for (int i = Math.max(1, n - String.valueOf(n).length() * 9); i < n; i++) {
            int decompositionSum = i + digitSum(i);  // 분해합 계산
            if (decompositionSum == n) {
                result = i;
                break;
            }
        }

        // 결과 출력
        System.out.println(result);
    }

}
