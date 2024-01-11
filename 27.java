class Solution {
    public static String solution(String phone_number) {
        String left = phone_number.substring(0,phone_number.length()-4).replaceAll("[0-9]","*");
        String right = phone_number.substring(phone_number.length()-4);

        return left+right;
    }
}
