class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String revStr = "";
        for(int i=arr.length-1; i>=0; i--){
            revStr += arr[i] + " ";

            
        }return revStr.trim().replaceAll("\\s+", " ");
    }
}