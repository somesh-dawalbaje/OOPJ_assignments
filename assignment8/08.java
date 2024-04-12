enum DayOfWeek{
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday;
}

class Demo{
    public static void main(String[] args) {
        DayOfWeek day=DayOfWeek.Friday;
        System.out.println("Today is: ");
        printDay(day);
        System.out.println("Tomorrow will be: ");
        printDay(nextDay(day));
        System.out.println("Day number of " + day + " is: " + getNumber(day));
        System.out.println("Weekend days are: ");
        DayOfWeek[] weekend = getWeekendDays();
        for (DayOfWeek days : weekend) {
            System.out.println(days);
        }
    }

    public static void printDay(DayOfWeek day){
        System.out.println(day.name());
    }

    public static DayOfWeek nextDay(DayOfWeek day){
        DayOfWeek[] days = DayOfWeek.values();
        int nextDayIndex = (day.ordinal() + 1) % days.length;
        return days[nextDayIndex];
    }

    public static int getNumber(DayOfWeek day){
        return day.ordinal()+1;
    }    

    public static DayOfWeek[] getWeekendDays(){
        return new DayOfWeek[] {DayOfWeek.Saturday, DayOfWeek.Sunday};
    }
}