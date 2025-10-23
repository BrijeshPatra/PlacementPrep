package slidingWindow;

public class MinimumSizeSubArraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int currSum=0;
        int left=0,right=nums.length;
        int minWindowLen=Integer.MAX_VALUE;

        while (right<nums.length){
            currSum+=nums[right];
            right++;

            while (currSum>=target){
                int currWindowSize=right-left;
                minWindowLen=Math.min(minWindowLen,currWindowSize);

                currSum-=nums[left];
                left++;
            }
        }
        return minWindowLen==Integer.MAX_VALUE?0:minWindowLen;
    }
}
