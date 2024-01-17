class Solution {
    public static int solution(int[][] sizes) {
        
        int maxWidth = 0;
        int maxHeight=0;
        
        for(int i=0;i<sizes.length;i++){
            int max = Math.max(sizes[i][0],sizes[i][1]);
            int min = Math.min(sizes[i][0],sizes[i][1]);
            maxWidth = Math.max(maxWidth,max);
            maxHeight = Math.max(maxHeight,min);
        }
        
        return maxWidth * maxHeight;
    }
}
