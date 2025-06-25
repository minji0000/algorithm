package main.java;

import java.util.Scanner;

public class A250625 {

        // 자릿수의 합을 계산하는 함수
        private static int digitSum(int number) {
            int sum = 0;
            //범위가 양수만 들어오도록 정해져서 != 이 아니라 >0으로 해도 됨 !
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
            //n에서 자릿수의 최대 합을 뺀 최소값부터 탐색을 시작해야 하므로
            // Math.max(1, n - String.valueOf(n).length() * 9) 가 적합하다.
            //해당 값의 전은 무의미하고 Math.max()를 통해 음수가 됨을 방지해야한다..
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
