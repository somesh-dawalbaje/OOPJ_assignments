import java.util.*;

class RationalNumberCalculator{
    private int num1;
    private int num2;
    private double n1;
    private int num3;
    private int num4;
    private double n2;

    public RationalNumberCalculator(int num1,int num2,int num3, int num4){
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
        this.num4=num4;
        n1=(double)num1/num2;
        n2=(double)num3/num4;
    }

    
    public void add(int num1,int num2,int num3,int num4){
        if(num2!=0 && num4!=0){
            double result=n1+n2;
            System.out.println("Your addition is: "+result);
        }else
            System.out.println("can't divide by zero");
    }

    public void sub(int num1,int num2,int num3,int num4){
        if(num2!=0 && num4!=0){
            double result=n1-n2;
            System.out.println("Your subtarction is: "+result);
        }else
            System.out.println("can't divide by zero");
    }

    public void mult(int num1,int num2,int num3,int num4){
        if(num2!=0 && num4!=0){
            double result=n1*n2;
            System.out.println("Your multiplicaton is: "+result);
        }else
            System.out.println("can't divide by zero");
    }

    public void div(int num1,int num2,int num3,int num4){
        if(num2!=0 && num4!=0){
            double result=n1/n2;
            System.out.println("Your division is: "+result);
        }else
            System.out.println("can't divide by zero");
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        
        System.out.print("Enter first number numerator: ");
        int num1=sc.nextInt();
        System.out.print("Enter first number Denominator: ");
        int num2=sc.nextInt();
        

        System.out.print("Enter second number numerator: ");
        int num3=sc.nextInt();
        System.out.print("Enter second number Denominator: ");
        int num4=sc.nextInt();
        

        RationalNumberCalculator rnc=new RationalNumberCalculator(num1,num2,num3,num4);
        System.out.print("Choose an operation u want to perform: ");
        char ch=sc.next().charAt(0);
                switch (ch) {
                    case '+':
                        rnc.add(num1,num2,num3,num4);
                        break;

                    case '-':
                        rnc.sub(num1,num2,num3,num4);
                        break;

                    case '*':
                        rnc.mult(num1,num2,num3,num4);
                        break;

                    case '/':
                        rnc.div(num1,num2,num3,num4);
                        break;
                        
                    default:
                        System.out.println("please try again...");
                        break;
                }
       

    }

}