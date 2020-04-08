class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int x = 0; x < nums.length; x++) {

            for (int y = x + 1; y < nums.length; y++) {

                if (nums[x] + nums[y] == target) {


                    result[0] = x;
                    result[1] = y;

                }


            }
        }
        return result;

    }
}