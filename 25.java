import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

class Solution {
    public static int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for(int e : arr){
            if(e%divisor==0) list.add(e);
        }

        if(list.size()==0) list.add(-1);
        
        list.sort(Comparator.naturalOrder());

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
