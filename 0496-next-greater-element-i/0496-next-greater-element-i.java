class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result= new int[nums1.length];
        boolean ptr= false;
        for(int i=0; i<nums1.length; i++){
            ptr= false;
            result[i]=-1;
            for(int j=0; j<nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    ptr= true;
                }
                if(ptr==true && nums1[i]<nums2[j]){
                    result[i]=nums2[j];
                    break;
                }

            }
        }
        return result;
    }
}