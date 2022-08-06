//finding no of digits of a number
public class prog7 {
    public static void main(String[] args) {
        int a=noofdigits(0);
        System.out.println(a);
    }
    public static int noofdigits(int n)
    {
        if(n<0)
            n=n*-1;
        int a=0;
        if(n==0)
            a=1;
        else{
        a=(int)Math.log10(n)+1;}
        return a;
    }
}
