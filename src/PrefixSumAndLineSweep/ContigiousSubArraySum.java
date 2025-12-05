package PrefixSumAndLineSweep;

import java.util.HashSet;

public class ContigiousSubArraySum {
    public boolean contSubArrSum(int[]nums,int k){
        HashSet<Integer>set=new HashSet<>();

        int prefixSum=0;
        int prevMod=0;

        for (int num:nums){
            prefixSum+=num;

            int currMod=prefixSum%k;

            if (set.contains(currMod)){
                return true;
            }
            set.add(prevMod);
            prevMod=currMod;
        }
        return false;
    }
}
