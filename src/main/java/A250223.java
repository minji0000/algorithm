package main.java;

import java.util.Scanner;

public class A250223 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();

        long totalSum = 0;
        long currentNumber = 0;

        for (char c : s.toCharArray()) {
            //문자가 숫자 형태인지 확인
            if (Character.isDigit(c) {  // 숫자인 경우
                currentNumber = currentNumber * 10 + (c - '0');  // 숫자 조합(확장)
                //연속된 술자일 수 있어 기존 숫자에 10을 곱해주고 현재 1의 자리수 값을 (c -'0') 연산을 통해 구한 다음 더해줌
                //근데  (c -'0') 이 연산 이해가 안 돼 ,,
            } else {
                totalSum += currentNumber;
                currentNumber = 0;
            }
        }

        totalSum += currentNumber;

        System.out.println(totalSum);

        scanner.close();
    }
}
