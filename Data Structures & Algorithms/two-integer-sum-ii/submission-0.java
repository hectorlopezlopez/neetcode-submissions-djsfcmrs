class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int left = 0, rigth = numbers.length - 1;
        while (left < rigth) {
            int sum = numbers[left] + numbers[rigth];
            if (numbers[left] + numbers[rigth] == target) {
                return new int[]{left + 1, rigth + 1};
            } else if (sum < target) {
                left++;
            } else if (sum > target) {
                rigth--;
            }
        }
        return new int[]{};
    }
}
