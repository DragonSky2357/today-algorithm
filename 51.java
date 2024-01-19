class Solution {
    public static String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        int f = 0;

        for(int n : food){
            for(int i=0;i<n/2;i++){
                sb.insert(sb.length()/2,f);
                sb.insert(sb.length()/2,f);
            }
            f++;
        }
        sb.insert(sb.length()/2,0);

        return sb.toString();
    }
}
