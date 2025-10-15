package TwoPointers;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        int j=nums.length-1;

        //find the pivot
        while (i>0 && nums[i]>=nums[i+1]){
            i--;
        }

        if(i>=0){
            //find the element which is greater than pivot then swap
            while (nums[j]<=nums[j+1])j--;
            swap(nums,i,j);
        }
        //reverse the suffix
        reverse(nums,i+1,nums.length-1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
