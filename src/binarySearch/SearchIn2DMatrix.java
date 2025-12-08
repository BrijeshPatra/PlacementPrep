package binarySearch;

public class SearchIn2DMatrix {
    public boolean searchMatrix(int[][]matrix,int target){
        int rowIdx=searchPotentialRow(matrix,target);
        if (rowIdx!=-1)return binarySearchOverRow(rowIdx,matrix,target);
        else return false;
    }

    public int searchPotentialRow(int[][] matrix, int target) {
        int left=0,right= matrix.length-1;
        int mid=left+(right-left)/2;
        while (left<=right){
            if(matrix[mid][0]<=target && target<=matrix[mid][matrix[0].length]-1){
                return mid;
            }else if(matrix[mid][0]<target){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return -1;
        }


    public boolean binarySearchOverRow(int rowIdx, int[][] matrix, int target) {
        int left=0;
        int right=matrix[rowIdx].length-1;
        while (left<=right){
            int mid=left+(right-left)/2;

            if (matrix[rowIdx][mid]==target)return true;
            else if (matrix[rowIdx][mid]<target)left=mid+1;
            else right=mid-1;
        }
        return false;
    }

}
