class Solution {
    public int search(int[] nums, int target) {
     int left = 0 , rigth = nums.length-1;
            int middle ;

            while(left<=rigth){
                middle = left + (rigth-left)/2;
                if(nums[middle] == target){
                    return middle;
                } else if (nums[middle]>target){
                    rigth=middle-1;
                }else{
                    left=middle+1;
                }
            }
            return -1;
    }
}
