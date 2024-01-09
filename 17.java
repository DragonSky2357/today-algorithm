import java.util.*;

class Solution {
    public int[] solution(long n) {
        List<Integer> answer = new ArrayList<>();

        String[] splitString = Long.toString(n).split("");

        for(String i : splitString){
            answer.add(Integer.valueOf(i));
        }
        
        Collections.reverse(answer);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
