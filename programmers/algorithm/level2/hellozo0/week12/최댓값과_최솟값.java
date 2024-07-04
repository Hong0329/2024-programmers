package programmers.algorithm.level2.hellozo0.week12;

class Solution {
    public String solution(String s) {
        String[] numbers = s.split(" ");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++){
            int number = Integer.parseInt(numbers[i]);

            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        return min+ " " +max;
    }
}