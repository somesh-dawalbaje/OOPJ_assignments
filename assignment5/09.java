import java.util.*;

class Date{
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public boolean isValid(){
        if(day<0 || (month<0 && month>12) || year<0)
            return false;
        
        int maxDay=31;

        if(month==4 || month==6 || month==9 || month==11)
            maxDay=30;
        else if(month==2)
            if(isLeapYear())
                maxDay=29;
            else
                maxDay=28;
        
        return day>0 && day<=maxDay;
    }

    public boolean isLeapYear(){
        if(year%4==0 && year%100!=0)
            return true;
        else if(year%400==0)
            return true;
        else
            return false;
        
    }

    public int getDays(int month,int year){
        if(month==4 || month==6 || month==9 || month==11)
            return 30;
        else if(month==2)
            if(isLeapYear())
                return 29;
            else
                return 28;
        else
            return 31;
    }



    public Date getNextDate(int day, int month, int year){
        int nextDay=day+1;
        int nextMonth=month;
        int nextYear=year;

        if(nextDay>getDays(month, year)){
            nextDay=1;
            nextMonth=month++;
            if(nextMonth>12){
                nextMonth=1;
                nextYear++;
            }
        }

        return new Date(nextDay, nextMonth, nextYear);
    }

    public Date getprevDate(int day, int month, int year){
        int prevDay=day-1;
        int prevMonth=month;
        int prevYear=year;

        if(prevDay<=0){
            prevMonth--;
            if(prevMonth<=0){
                prevMonth=12;
                prevYear--;
            }
            prevDay=getDays(prevMonth, prevYear);
        }

        return new Date(prevDay, prevMonth, prevYear);
    }

    public String toString(){
        return this.day+"/"+this.month+"/"+this.year;
    }
}

class UserCal{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a valid date: ");
        int day=scanner.nextInt();
        System.out.print("Enter a valid Month: ");
        int month=scanner.nextInt();
        System.out.print("Enter a valid year: ");
        int year=scanner.nextInt();

        Date obj=new Date(day, month, year);
        if(obj.isValid())
            System.out.println("Valid Date: "+obj);
        else
            System.out.println("Enter a valid date");

        if(obj.isLeapYear()){
            System.out.println("Leap Date: "+year);
        }else{
            System.out.println("not a leap year: "+year);
        }

        System.out.println("next day is: "+obj.getNextDate(day, month, year));
        System.out.println("previous day is: "+obj.getprevDate(day, month, year));
    }
}