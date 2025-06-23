package main.java;

import java.util.Scanner;

public class A250623 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            scanner.nextLine();
            String s = scanner.nextLine();

            long totalSum = 0;
            long currentNumber = 0;

            for (char c : s.toCharArray()) {
                //와.. 생각없이 c.isDigit() 이라고 해서 틀렸당 힝.. 하나 틀림
                if (Character.isDigit(c)) {  // 숫자인 경우
                    currentNumber = currentNumber * 10 + (c -'0');  // 숫자 조합(확장)
                    //히든숫자는 연속된 숫자로 두 자리 이상일 수 있습니다.
                    // 자릿수의 연산을 위해 기존 숫자에 10을 곱해주고
                    // 현재 1의 자리수 값을 (c - '0') 연산을 통해 구한다음 더해줍니다.
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
