public class LargestPrimeFactor{
    static long largestPrimeFactor(int N) {
        // code here
        long st = 2;
        while(st*st<=N)
        {
            if(N%st==0)
            {
                N/=st;
            }
           else{
               st++;
           }
        }
        return N;
    }
    public static void main(String[] args) {
        int n = 24;
        System.out.println(largestPrimeFactor(n));
    }
}
