package mergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][]merge(int[][]intervals){
        //sort by starting time by comparing 2 intervals st point
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int n= intervals.length;
        int[][]res=new int[n][2];
        res[0]=intervals[0];
        int endpoint=0;

        //traverse and check the end time of last interval
        //with starting time of current interval

        for (int i=1;i<n;i++){
            if (intervals[i][0]<=res[endpoint][1]){
                //if start point<=endpoint then it is overlapping: update end pt of cur ele
                //take max of endpoint of last and endpoint of current: merging
                res[endpoint][1]=Math.max(res[endpoint][1],intervals[i][1]);
            }else{
                //if not overlapping move to next interval by incrementing the endpoint
                endpoint++;
                res[endpoint]=intervals[i];
            }
        }
        //return the array
        return Arrays.copyOfRange(res,0,endpoint+1);
    }
}
