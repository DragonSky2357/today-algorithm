class Solution {
    public static boolean primeNumber(int num){
        for(int i=2; i<num; i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static int solution(int[] answers) {
        int count=0;
        
        for(int i=0;i<answers.length;i++){
            for(int j=i+1;j<answers.length;j++){
                for(int k=j+1;k<answers.length;k++){
                    int sum = answers[i] + answers[j] + answers[k];
                    if(primeNumber(sum)) count++;
                }
            }
        }

        return count;

    }
}
