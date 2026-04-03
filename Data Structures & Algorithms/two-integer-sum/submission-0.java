class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer,Integer> hashTable = new Hashtable<>();
        for(int i = 0 ; i < nums.length ; i++){
            int diference = target - nums[i];
            if(hashTable.containsKey(diference)){
                    return new int[] { hashTable.get(diference), i };
            }
            hashTable.put(nums[i],i);
        }
        return new int[]{-1,-1};

    }
}
