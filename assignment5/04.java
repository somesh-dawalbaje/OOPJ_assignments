class ElectricityBill{
    private String customerName;
    private double unitsConsumed;
    private double billAmount;

    public ElectricityBill(String customerName, double unitsConsumed){
        this.customerName=customerName;
        this.unitsConsumed=unitsConsumed;
        this.billAmount=0.0d;
    }

    public double calculateBillAmount(){
        if(unitsConsumed<=100)
            billAmount=billAmount+unitsConsumed*5;
        else if(unitsConsumed<=300)
            this.billAmount=100*5+7*(unitsConsumed-100);
        else
            billAmount=100*5+200*7+10*(unitsConsumed-300);

        return billAmount;
    }    

    public void displayBill() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Bill Amount: Rs. " + billAmount);
    }

}

class User2{
    public static void main(String[] args) {
        ElectricityBill eb1=new ElectricityBill("Somesh", 55.2);
        eb1.calculateBillAmount();
        eb1.displayBill();
        
    }
}