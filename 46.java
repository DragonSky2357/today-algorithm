import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int solution(String s) {
        int answer = 0;

        Map<String,Integer> m = new HashMap<>();
        m.put("zero",0);
        m.put("one",1);
        m.put("two",2);
        m.put("three",3);
        m.put("four",4);
        m.put("five",5);
        m.put("six",6);
        m.put("seven",7);
        m.put("eight",8);
        m.put("nine",9);

        for(String key : m.keySet()){
            s = s.replaceAll(key,m.get(key).toString());
        }

        return Integer.parseInt(s);
    }
}
