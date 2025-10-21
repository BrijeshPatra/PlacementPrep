package hashing;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {
    public static int maxSum(int[] arr, int k) {
        Map<Integer,Integer>map=new HashMap<>();

        map.put(0,1);

        int count=0;
        int currSum=0;

        for (int num:arr){
            currSum+=num;

            if (map.containsKey(currSum-k)){
                currSum+=map.get(currSum-k);
            }
            map.put(currSum,map.getOrDefault(currSum,0)+1);
        }
        return count;
    }
}
