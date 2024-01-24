class Solution {
    public static int solution(int n, int m, int[] section) {
        int roller = section[0];
        int cnt = 1;
        
        for(int i = 1; i < section.length; i++) {
            if(roller + m - 1 < section[i]) {
                roller = section[i];
                cnt++;
            }
        }
        return cnt;
    }
}