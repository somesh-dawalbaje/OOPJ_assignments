import java.util.*;

class Demo4{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float a=scanner.nextFloat();

        if(a<18.5f){
            System.out.println("underweight");
        }else if(a>=18.5f && a<25){
            System.out.println("normal");
        }else if(a>=25 && a<30){
            System.out.println("overweight");
        }else{
            System.out.println("obese");
        }
    }
}