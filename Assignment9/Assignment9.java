import java.util.Scanner;

class ExceptionDemo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int arr[]=new int[5];
        int num3=sc.nextInt();
        try{
            System.out.println(arr[6]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception: "+e.getMessage());
        }

        try{
            if(num2==0)
                throw new ArithmeticException("can't divide by zero");
        }catch(ArithmeticException e){
            e.printStackTrace();
        }catch(RuntimeException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }

        try{
            oddException(num3);
        }catch(Exception e){
            e.printStackTrace();
        }

    }  
    
    public static void oddException(int n)throws Exception{
        if(n%2!=0)
            throw new Exception("n is odd");
        System.out.println("number is even");    
    }

}