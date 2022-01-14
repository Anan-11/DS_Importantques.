class Solution {
    public int removeDuplicates(int[] nums) {
        for(int i=0;i<nums.length-1;)
        {
            if(nums[i]==nums[i+1])
            {
                int j;
                for(j=i;j<nums.length-1;j++)
                {
                    nums[j]=nums[j+1];
                    
                }
                nums[j]=Integer.MAX_VALUE;
            }
            else
            {
                i++;
            }
            if(nums[i]==Integer.MAX_VALUE)
                break;
        }
        int count=0;
        for(int x:nums)
        {
            if(x==Integer.MAX_VALUE)
                break;
            else
                count++;
        }
        return count;
        
    }
}
