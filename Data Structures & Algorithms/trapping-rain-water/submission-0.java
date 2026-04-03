class Solution {
    public int trap(int[] height) {
        int left = 0 ,maxLeft = 0, rigth = height.length-1, maxRigth=0;
        int maxWat=0;
        while(left<rigth){
            if(height[left]<height[rigth]){
                if(height[left]>maxLeft){
                    maxLeft=height[left];
                }else{
                    maxWat+=maxLeft-height[left];
                }
                left++;
            }else if(height[left]>=height[rigth]){
                if(height[rigth]>maxRigth){
                    maxRigth=height[rigth];
                }else{
                    maxWat+=maxRigth-height[rigth];
                }
                rigth--;
            }

        }
        return maxWat;
    }
    
}
