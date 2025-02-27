package main.java;

import java.util.Scanner;

public class A250227 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 주사위 눈 입력
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        int prize;

        // 상금 계산
        if (a == b && b == c) {
            prize = 10000 + a * 1000;
        } else if (a == b || b == c || c == a) {
            if (a == b || a == c) {
                prize = 1000 + a * 100;
            } else {
                prize = 1000 + b * 100;
            }
        } else {
            prize = Math.max(a, Math.max(b, c)) * 100;
        }

        // 결과 출력
        System.out.println(prize);
    }

}
