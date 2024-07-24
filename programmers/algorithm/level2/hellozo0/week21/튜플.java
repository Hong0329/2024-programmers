package programmers.algorithm.level2.hellozo0.week21;

import java.util.ArrayList;
import java.util.Arrays;

public class 튜플 {
    import java.util.*;
    class Solution {
        public int[] solution(String s) {
            ArrayList<Integer> answer = new ArrayList<>();

            //1. {} 벗겨내기
            s = s.substring(2,s.length()-2);
            String[] sArray = s.split("\\},\\{");

            //2. 길이로 정렬하기
            Arrays.sort(sArray, (o1, o2) -> {
                return o1.length() - o2.length();
            });

            //3. 각 요소 별로 배열에 넣기
            for(String k : sArray) {
                String[] tArray = k.split(",");

                for(String a : tArray){
                    int num = Integer.parseInt(a);

                    if( !answer.contains(num))
                        answer.add(num);
                }
            }
            return answer.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}
