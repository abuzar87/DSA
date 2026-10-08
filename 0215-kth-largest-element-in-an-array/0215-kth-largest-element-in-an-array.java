import java.util.*;
class Solution {
    public void mergeSort(int[] arr){
        if(arr.length <= 1){
            return;
        }
        int mid = arr.length/2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);
        merge(left, right, arr);
        
       
     }

    public void merge(int[] left, int[] right, int[] result){
        int i=0, j=0, k=0;
        while(i<left.length && j<right.length)
        if(left[i] <= right[j]){
            result[k++] = right[j++];
        }else{
             result[k++] = left[i++];
        }
        while(i<left.length){
             result[k++] = left[i++];
        }
        while(j<right.length){
            result[k++] = right[j++];
        }
    } 
    public int findKthLargest(int[] nums, int k) {
        mergeSort(nums);
        return nums[k-1];
    }
}