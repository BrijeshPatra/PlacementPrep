package slidingWindow;

import java.util.HashSet;
import java.util.Set;

//fixed size sliding window
public class MaxSumOfDistinctSubArray {
    public int maximumSubArraySum(int[]nums,int k){
        //array shouldn't contain duplicates
        Set<Integer>set=new HashSet<>();

        int currSum=0;
        int maxSum=0;

        int left=0;
        for (int right=0;right<nums.length;right++){

            //check if set contains duplicate or set size is equals k
            while (set.contains(nums[right]) || set.size()==k){
                //if yes remove left
                set.remove(nums[left]);
                //subtract the sum - left
                currSum-=nums[left];
                //increment the left pointer
                left++;
            }

            //if no then add right to currSum
            currSum+=nums[right];
            //also add the right pointer to the set
            set.add(nums[right]);

            //check if set size is equals to k
            if(set.size()==k){
                //find the maximum sum
                maxSum=Math.max(currSum,maxSum);
            }
        }
        return maxSum;
    }
}
