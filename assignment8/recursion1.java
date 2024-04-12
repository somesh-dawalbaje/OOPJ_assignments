class recursion1{
    static int sum=0;
    static int fib(int n){
       if(n<=1){
            return n;
       }

        sum=fib(n-1)+fib(n-2);
        return sum;
        
    }

    static boolean isPalindrome(int n){
        int temp=0;
        int temp1=n;
        if(n==0)
            return temp==n;
        temp=temp*10+temp1%10;
        return isPalindrome(temp1/10);
        
    }

    
    public static void main(String[] args) {
        /*for (int i = 0; i <=10; i++) {
            System.out.println(fib(i));
        }*/
        System.out.println(isPalindrome(105));
    }
}