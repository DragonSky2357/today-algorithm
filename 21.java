class Solution {
    public boolean solution(int x) {
        String[] data = Integer.toString(x).split("");

        int sum=0;

        for(String c : data ){
            sum+= Integer.parseInt(c);
        }

        if(x%sum == 0) return true;
        
        return false;
    }
}
