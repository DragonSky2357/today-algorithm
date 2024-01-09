import java.util.*;

class Solution {
    public long solution(long n) {
       String[] list = String.valueOf(n).split("");
       
       Arrays.sort(list,Comparator.reverseOrder());
       StringBuilder sb = new StringBuilder();

        for(String i : list){
            sb.append(i);
        }


       return Long.parseLong(sb.toString());
    }
}
