
//https://practice.geeksforgeeks.org/problems/sum-of-two-numbers-without-using-arithmetic-operators/1#
//sum of two numbers without using + operator


class Solution
{
    int sum(int a , int b)
    {
        
        int carry=a&b;
        int res=a^b;
        while(carry!=0)
        {
            carry=carry<<1;
            int temp=carry;
            carry=carry&res;
            res=temp^res;
        }
        return res;
        
        //code here
    }
}
