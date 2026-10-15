class Solution {
    public int lengthOfLastWord(String s) {
        
        String[] arr = s.split(" ");

        String st = arr[arr.length-1];
        int length = st.length();
        return length;
    }
}