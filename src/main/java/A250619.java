package main.java;
import java.util.*;
import java.util.stream.*;

public class A250619 {


        public static String checkNumbers(int n, int[] cards, int m, int[] numbers) {
            Set<Integer> cardSet = ____;  // 카드 번호들을 세트로 저장

            // Stream을 사용하여 cards 배열의 모든 요소를 cardSet에 추가
            Arrays.stream(cards).forEach(cardSet::add);

            return Arrays.stream(numbers)
                    .mapToObj(num -> cardSet.____ ? ____ : "0")  // 각 숫자의 존재 여부 확인
                    .collect(Collectors.joining(" "));  // 결과를 공백으로 구분하여 연결
        }

        // 메인 메서드 예시
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();
            int[] cards = new int[N];
            for (int i = 0; i < N; i++) {
                cards[i] = sc.nextInt();
            }

            int M = sc.nextInt();
            int[] numbers = new int[M];
            for (int i = 0; i < M; i++) {
                numbers[i] = sc.nextInt();
            }

            System.out.println(checkNumbers(N, cards, M, numbers));
            sc.close();
        }
}
