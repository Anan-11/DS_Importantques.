//leetcode   easy ques. soln;
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();int beg=0;int end=s.length()-1;
        while(beg<end)
        {
            char c1=s.charAt(beg);
            char c2=s.charAt(end);
            if((97<=c1 && c1<=122) || (48<=c1 && c1<=57))
            {
                if((97<=c2 && c2<=122) || (48<=c2 && c2<=57))
                {
                    if(c1!=c2)
                        return false;
                    else{
                        beg++;end--;
                    }
                        
                }
                else{
                    end--;
                }
            }
            else{
                beg++;
            }
        }
        return true;
    }
}
