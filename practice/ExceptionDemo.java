import java.util.Scanner;

class ExceptionDemo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        try{
            if(num2==0)
                throw new ArithmeticException("Can't divide by zero");
            System.out.println(num1/num2);
    
         }catch(ArithmeticException e){
             e.printStackTrace();
        }finally{
            sc.close();
        
        }
    }    

}