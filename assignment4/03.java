class Company{
    void displayInfo(String name){
        System.out.println("name of company: "+name);
    }

    void displayInfo(int year){
        System.out.println("founding year: "+year);
    }

    void displayInfo(double revenue, String unit){
        System.out.println("revenue in last year: "+revenue+unit);
    }
}

class Demo2{
    public static void main(String[] args) {
        Company c1=new Company();
        c1.displayInfo(1987);
        c1.displayInfo("Redbull");
        c1.displayInfo(10.9d,"Billion");
    }
}