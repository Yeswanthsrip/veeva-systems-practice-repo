class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        LinkedHashSet<Integer> hs=new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
            }
        }
        int i=0;
        for(int x:hs){
            nums[i++]=x;
        }
        return hs.size();
    }
}