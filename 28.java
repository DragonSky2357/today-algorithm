class Solution {
    public static int solution(int[] numbers) {
        boolean[] flag = new boolean[10];
        int sum=0;
        
        for(int i=0;i<numbers.length;i++){
            flag[numbers[i]] = true;
        }
        
        for(int i=0;i<flag.length;i++){
            sum+= flag[i]==false ? i : 0;
        }
        
        return sum;
    }
}
