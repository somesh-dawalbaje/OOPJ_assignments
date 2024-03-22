import java.util.*;

class TollBoothBillGenerator{
    private String carType;
    private int nofAxle;
    private double distance;
    private double tollFee;
    private double totalAmountFee;

    public TollBoothBillGenerator(){
        this.tollFee=0.0d;
        this.totalAmountFee=0.0d;
    }
    
    public void setCarType(String carType){
        this.carType=carType;
    }

    public void setNofAxle(int noAxle){
        this.nofAxle=noAxle;
    }

    public void setDistance(double distance){
        this.distance=distance;
    }

    public String getCarType(String carType){
        return carType;
    }

    public int getNofAxle(int noAxle){
        return noAxle;
    }

    public double getDistance(double distance){
        return distance;
    }

   

    public void calculateTollFee(){
        if(carType==null || nofAxle==0 || distance==0)
            System.out.println("Enter appropriaye values");

        if(carType=="truck"){
            tollFee=tollFee+(nofAxle*0.5)*distance;
        }else{
            tollFee=tollFee+(nofAxle*0.25)*distance;
        }

        System.out.println("Your toll fee is calculated."); 
        System.out.println();       
    }

    public void generateBill(){
        if(tollFee==0)
            System.out.println("Toll fee is not calculated");

        totalAmountFee=2+this.tollFee;
        System.out.println();
        System.out.println("vehicle Details:");
        System.out.println();
        System.out.println("Vehicle type: "+carType);
        System.out.println("no. of axles: "+nofAxle);
        System.out.println("distance travelled: "+distance);
        System.out.println("Toll Fee: "+tollFee);
        System.out.println("Your total amount due: "+totalAmountFee);
        System.out.println("Thanks for using our program....");
        System.out.println();
    }

    public void showMenu(){
        Scanner sc=new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to tollbooth bill generator");
            System.out.println("1. Enter Vehicle Type");
            System.out.println("2. Enter number of axle");
            System.out.println("3. Enter distance travelled");
            System.out.println("4. Calculate Toll fee");
            System.out.println("5. Generate bill");
            System.out.println("6. Exit");
            int x=sc.nextInt();

            switch (x) {
                case 1:
                    System.out.print("Enter Vehicle Type: ");
                    sc.nextLine();
                    carType=sc.nextLine().toLowerCase();
                    setCarType(carType);
                    break;
                case 2:
                    System.out.print("Enter number of axle: ");
                    nofAxle=sc.nextInt();
                    setNofAxle(nofAxle);
                    break;
                case 3:
                    System.out.print("Enter distance traveled: ");
                    distance=sc.nextDouble();
                    setDistance(distance);
                    break;
                
                case 4:
                    calculateTollFee();
                    break;
                case 5:
                    generateBill();
                    break;
                case 6:
                    System.out.println("Exit....");
                    System.exit(0);
                default:
                    System.out.println("Please, try again");
            }
        }
    }

    public static void main(String[] args) {
        TollBoothBillGenerator toll=new TollBoothBillGenerator();
        toll.showMenu();
    }
}


