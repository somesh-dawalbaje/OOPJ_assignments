class CreditScoreCalculator{
    private int creditHistory;
    private double creditUtilization;
    private boolean paymentHistory;

    public CreditScoreCalculator(int creditHistory,double creditUtilization, boolean paymentHistory){
        this.creditHistory=creditHistory;
        this.creditUtilization=creditUtilization;
        this.paymentHistory=paymentHistory;
    }

    public int getCreditHistory(){
        return this.creditHistory;
    }

    public double getCreditUtilization(){
        return this.creditUtilization;
    }

    public boolean getpaymentHistory(){
        return this.paymentHistory;
    }

    public void setCreditHistory(int creditHistory){
        this.creditHistory=creditHistory;
    }

    public void setCreditUtilization(double creditUtilization){
         this.creditUtilization=creditUtilization;
    }

    public void setpaymentHistory(boolean paymentHistory){
        this.paymentHistory=paymentHistory;
    }

    public int calculateCreditScore(){
        int creditScore;
        if(paymentHistory){
            creditScore=(creditHistory*15)+(int)(creditUtilization*30)+55;
        }else{
            creditScore=(creditHistory*15)+(int)(creditUtilization*30)+35;
        }

        return creditScore;
    }

    public static void main(String[] args) {
        CreditScoreCalculator csc=new CreditScoreCalculator(10,20,true);
        System.out.println("Your credit score is: "+csc.calculateCreditScore());
    }

}