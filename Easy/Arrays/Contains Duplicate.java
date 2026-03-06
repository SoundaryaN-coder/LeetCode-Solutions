//Problem : Contains Duplicate
//Approach : HashSet
//Difficulty : Easy
//Time Complexity : o(n)
//Space Complexity : o(n)

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for (int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
