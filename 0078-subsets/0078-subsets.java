class Solution {
    List<List<Integer>> result=new ArrayList<>();
    void MnnDola(int [] nums, int idx, List<Integer> temp){

        if(idx==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]);
        MnnDola(nums,idx+1, temp);
        temp.remove(temp.size()-1);
        MnnDola(nums, idx+1, temp);

    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp= new ArrayList<>();
        int idx=0;

        MnnDola(nums,idx,temp);
        return result;



        
    }
}