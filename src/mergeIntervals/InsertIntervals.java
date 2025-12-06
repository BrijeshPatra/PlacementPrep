package mergeIntervals;

import java.util.ArrayList;
import java.util.List;

public class InsertIntervals {
    public int[][]insert(int[][]intervals,int[]newInterval){
        int n= intervals.length;
        List<int[]>res=new ArrayList<>();
        int i=0;

        //adding non overlapping intervals
        while (i<n && intervals[i][1]< newInterval[0]){
            //they are not overlapping  [1,2][3,5]
            res.add(intervals[i]);
            i++;
        }

        while (i<n && intervals[i][0]<= newInterval[1]){
            //it is overlapping : [1,3][2,5]
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][0]);
            i++;
        }
        //add or insert the new intervals
        res.add(newInterval);
        //add the current intervals the resulting array
        while (i<n){
            res.add(intervals[i]);
            i++;
        }
        return res.toArray(new int[res.size()][]);
    }
}
