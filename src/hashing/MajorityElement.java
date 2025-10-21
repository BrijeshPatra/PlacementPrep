package hashing;

import java.util.HashMap;
import java.util.Map;

//find element in array which appears more than n/2 times
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        int n=nums.length;

        for (int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);

            if (map.get(num)>n/2){
                return num;
            }
        }
        return -1;
    }
}
