class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       //Using Hash Map 
       int[] arr = new int[26];
       for(char c : magazine.toCharArray()){
        arr[c - 'a']++;
       }

       for(char c : ransomNote.toCharArray()){
        if(arr[c-'a'] == 0){ //char no available 
            return false;
        }arr[c-'a']--;
       }//for loop end mean all values construct
       return true;
    }
}