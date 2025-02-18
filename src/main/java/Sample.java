package main.java;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public int[] solution(int[] arr, int divisor) {


        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }

        if(list.isEmpty()){
            list.add(-1);
        }

        // 왜 배열의 크기를 지정해야되는지??
        // 사용할 때는 배열의 크기를 지정
        answer = new int[list.size()];

        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);
        System.out.println(Arrays.toString(arr)); // sout를 해야 console창에 값이 나옴
        return answer;
    }
}
