"""
Problem: Two Sum
Language: Python
Approach: Hash Map (Dictionary)
Time Complexity: O(n)
Space Complexity: O(n)
"""

from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        m = {}

        for i, x in enumerate(nums):
            y = target - x

            if y in m:
                return [m[y], i]

            m[x] = i
