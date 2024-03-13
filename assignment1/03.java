import java.util.*;

class Demo1{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();

        char ch=scanner.next().charAt(0);

        switch (ch) {
            case '+':
                System.out.println(a+b);
                break;

            case '-':
                System.out.println(a-b);
                break;
            
            case '/':
                System.out.println(a/b);
                break;
                
            case '*':
                System.out.println(a*b);
                break;

            default:
                System.out.println("enter appropriate symbol");
                break;
        }
    }
}