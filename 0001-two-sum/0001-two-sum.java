class Solution {
    public int[] twoSum(int[] nums, int target) {
        		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int number = nums[i];
			int difference = target - number;

			if (map.containsKey(difference)) {
				return new int[] { i, map.get(difference) };
			}
			map.put(number, i);
		}
		return new int[] {};
    }
}