class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int j=0;
            while(j != nums.length-1){
                if(nums[j] == 0){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                } j++;
            }
        }System.out.println(Arrays.toString(nums));
    }
}