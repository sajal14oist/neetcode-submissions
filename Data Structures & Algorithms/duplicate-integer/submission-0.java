class Solution {
    public boolean hasDuplicate(int[] nums) {


        Set<Integer> set = new HashSet<>();
        
        return Arrays.stream(nums)
                .anyMatch(num-> !set.add(num));
        
    }
}