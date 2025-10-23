package slidingWindow;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class FirstNegativeNumber {
    public static List<Integer> firstNegativeNumb(int[] arr, int k) {
        List<Integer>result=new ArrayList<>();
        Deque<Integer>dq=new LinkedList<>();
        int n=arr.length;
        int i=0,j=0;

        while (j<n){
            if(arr[j]<0){
                dq.add(arr[j]);
            }

            if (j-i+1<k){
                j++;
            }else if (j-i+1==k){
                if (!dq.isEmpty()){
                    result.add(arr[dq.peekFirst()]);
                }else {
                    result.add(0);
                }
            }
            if(!dq.isEmpty() && dq.peekFirst()==i){
                dq.removeFirst();
            }
            j++;
            i++;
        }
        return result;
    }
}
