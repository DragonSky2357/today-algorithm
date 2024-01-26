class Solution {
    public static int solution(int number, int limit, int power) {
        int[] data = new int[number + 1];
        int sum=0;

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number / i; j++) {
                data[i * j]++;
            }
        }

        for(int i=1;i<=number;i++) {
            if(data[i] > limit) sum+= power;
            else sum += data[i];
        }

        return sum;
    }
}
