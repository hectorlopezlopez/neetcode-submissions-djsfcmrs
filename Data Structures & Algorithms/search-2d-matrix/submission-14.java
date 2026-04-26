class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int left = 0 ,rigth = matrix[0].length * matrix.length-1;
       int middle,cValue;
       while(left<=rigth){
        middle = left + (rigth-left)/2;
        cValue = matrix[middle/matrix[0].length][middle%matrix[0].length];
        if(cValue == target){
            return true;
        }
        else if(target<cValue){
            rigth = middle-1;
        }
        else {
            left = middle+1;
        }

       }
       return false;
    }
}
