class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        result = []

        for x in range(len(nums)):
            first_number = nums[x]
            for y in range(x+1, len(nums)):
                second_number = nums[y]
                if(first_number + second_number == target):
                    result.append(x)
                    result.append(y)
                    return result