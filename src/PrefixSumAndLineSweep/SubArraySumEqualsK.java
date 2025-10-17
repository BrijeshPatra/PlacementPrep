package PrefixSumAndLineSweep;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1); //empty subarray sum=0

        int count=0;
        int currSum=0;

        for (int num:nums){
            currSum+=num;

            if (map.containsKey(currSum-k)){
                count+=map.get(currSum-k);
            }
            map.put(currSum,map.getOrDefault(currSum,0)+1);
        }

        return count;

    }
}
