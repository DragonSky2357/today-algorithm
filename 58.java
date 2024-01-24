import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static int[] solution(int[] answers) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2, 1, 2, 3, 2, 4, 2, 5};
        int arr3[] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] cnt = new int[3];

        for(int i=0;i<answers.length;i++){
            if(arr1[i%arr1.length] == answers[i]) cnt[0]++;
            if(arr2[i%arr2.length] == answers[i]) cnt[1]++;
            if(arr3[i%arr3.length] == answers[i]) cnt[2]++;
        }


        int max = Arrays.stream(cnt).max().orElse(0);

        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<cnt.length;i++)
            if(cnt[i]==max) list.add(i+1);

        return list.stream().mapToInt(i->i).toArray();
    }
}
