class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] index= new int[2];
        Map<Integer,Integer> minus =new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(minus.containsKey(nums[i])){
                index[0]=minus.get(nums[i]);
                index[1]=i;
                return index;
            }
            minus.put(target-nums[i],i);
        }
        return index;
    }
}