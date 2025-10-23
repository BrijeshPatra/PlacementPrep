package slidingWindow;

public class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;

        int currProduct=1;
        int count=0;
        int left=0;

        for(int right=0;right<nums.length;right++){
            currProduct*=nums[right];

            while (currProduct>=k){
                currProduct/=nums[left];
                left++;
            }
            count+=(right-left+1);
        }
    return count;
    }
    }
