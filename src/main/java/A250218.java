package main.java;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class A250218 {

    public static void generateLotto(int[] numbers, List<Integer> selected, int start, int target) {

        //처음 들어올 땐 아무 요소도 없기 때문에 size() == 0
        if (selected.size() == target) {
            //
            System.out.println(selected.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(" ")));
            return;
        }


        for (int i = start; i < numbers.length; i++) {
            //첫번째 요소를 select에 넣는다. ex) select[0] = 1;
            selected.add(numbers[i]);

            //재귀함수로 다시 generateLotto() 호출
            generateLotto(numbers, selected, i+1, target);

            selected.remove(selected.size() - 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            //split(): 특정 문자를 기준으로 잘라 배열에 저장한다.
            String[] input = br.readLine().split(" ");

            //처음 입력한 숫자를 저장한다.
            int k = Integer.parseInt(input[0]);

            if (k == 0) break;

            //입력받은 k의 값만큼의 길이를 가진 int형 배열을 만든다.
            int[] numbers = new int[k];

            //입력 받은 숫자를 배열에 넣는다.
            for (int i = 0; i < k; i++) {
                numbers[i] = Integer.parseInt(input[i + 1]);
            }

            //generateLotto() 호출
            generateLotto(numbers, new ArrayList<>(), 0, 6);

            //개행
            System.out.println();
        }
    }

}
