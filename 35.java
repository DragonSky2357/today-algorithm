class Solution {
    public static long solution(int price, int money, int count) {
        long answer = 0;

        for(int i=0;i<count;i++){
            answer+= price * (i+1);
        }
        
        return (answer - money) > 0 ? -(money - answer) : 0;
    }
}
