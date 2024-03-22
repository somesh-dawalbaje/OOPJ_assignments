import java.util.Scanner;

class BMI{
    private double height;
    private double weight;

    public BMI(){
        this.height=0.0d;
        this.weight=0.0d;
    }

    public void setHeight(double height){
        this.height=height;
    }

    public void setWeight(double weight){
        this.weight=weight;
    }

    public double calculateBMI(){
        double result=this.weight/(this.height*this.height);

        return result;
    }
}

class User{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter height: ");
        double height=sc.nextDouble();
        
        System.out.print("Enter weight: ");
        double weight=sc.nextDouble();
       
        BMI userBmi=new BMI();

        userBmi.setHeight(height);
        userBmi.setWeight(weight);

        Double result=userBmi.calculateBMI();
       
        System.out.printf("Your BMI is: %.3f%n",result);


    }
}