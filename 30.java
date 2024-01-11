class Solution {
	  public static String solution(String s) {
	      int len=s.length();
	      int index=len/2;
	      return (len%2==0)?s.substring(index-1, index+1):s.substring(index, index+1);
	  }
}
