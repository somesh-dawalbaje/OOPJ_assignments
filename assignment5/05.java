import java.util.*;

class telephoneBillCalculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter phone number: ");
        String phoneNumber = sc.nextLine();

        System.out.print("Enter number of calls made: ");
        int numberOfCalls = sc.nextInt();

        System.out.print("Enter total duration of calls (in minutes): ");
        int totalDuration = sc.nextInt();

        double bill=telephoneBillCalculator.billCalculate(numberOfCalls, totalDuration);

        bill+=10.0d;
        System.out.println("Customer Name: " + customerName);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Total Bill Amount: $" + bill);
    }

    public static double billCalculate(int numberOfCalls, int totalDuration){
        double bill=0.0d;

        if(numberOfCalls<=100)
            bill=bill+numberOfCalls*0.5;
        else
            bill=bill+(numberOfCalls-100)*0.25+(numberOfCalls*0.5);

        //System.out.println(bill);

        if(totalDuration<1)
            totalDuration=1;
        
        return bill;
    }
}