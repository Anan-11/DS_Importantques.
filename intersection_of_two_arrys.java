//https://leetcode.com/problems/intersection-of-two-arrays/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i : nums1){
            set1.add(i);
        }
        for(int i : nums2){
            set2.add(i);
        }
        set1.retainAll(set2);
        int n = set1.size();
       Object[] arr = set1.toArray();
        int[] res = new int[arr.length];   
        for(int i = 0; i < arr.length; i++){
            res[i] = (int)arr[i];
        }
       
        return res;
    }
}
