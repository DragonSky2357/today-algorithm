import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();

        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());
        
        for(String data : str){
            answer.append(data);
        }
        
        return answer.toString();
    }
}
