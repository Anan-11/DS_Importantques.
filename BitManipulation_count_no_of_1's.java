//https://practice.geeksforgeeks.org/problems/power-of-2-1587115620/1/?page=1&category[]=Bit%20Magic&sortBy=submissions#

//find if a number can be written in terms of power of 2 or not

public static boolean isPowerofTwo(long n){
        if(n==1)
        return true;
        if(n>0 && n%2==0)
        {
            long count=0;
            while(n>0)
            {
                count=count+(n & 1);
                n=n>>1;
            }
            if(count>1)
            return false;
            else
            return true;
        }
        else
        return false;
        // Your code here
        
    }
