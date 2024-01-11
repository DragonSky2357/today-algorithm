import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public static int[] solution(int[] arr) {
        int[] answer = null;

        if(arr.length==-1) answer = new int[] {-1};
        else {
            List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

            list.remove(Collections.min(list));
            answer = new int[arr.length - 1];

            for(int i=0;i<list.size();i++){
                answer[i] = list.get(i);
            }
        }

        return answer;
    }
}
