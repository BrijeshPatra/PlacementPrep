package PrefixSumAndLineSweep;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1); //empty subarray sum=0

        int count=0;
        int prefixSum=0;

        for (int num:nums){
            prefixSum+=num;

            if (map.containsKey(prefixSum-k)){
                count+=map.get(prefixSum-k);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }

        return count;

    }
}
