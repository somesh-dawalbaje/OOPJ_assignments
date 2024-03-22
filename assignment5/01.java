
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.*;

class Demo{
    public static void main(String[] args)throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date and time (format: dd/mm/yyyy hh:mm:ss): ");
        String inputDateTime = sc.nextLine();

        SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        SimpleDateFormat outputFormat1=new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat outputFormat2=new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat outputFormat3=new SimpleDateFormat("yyyy/MM/dd");

        SimpleDateFormat outputFormat4=new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat outputFormat5=new SimpleDateFormat("HH:mm:ss a");
        SimpleDateFormat outputFormat6=new SimpleDateFormat("hh:mm");

        SimpleDateFormat outputFormat7=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat outputFormat8=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss a");
        SimpleDateFormat outputFormat9=new SimpleDateFormat("yyyy/MM/dd hh:mm");

        
        try{
        Date date=inputFormat.parse(inputDateTime);
          
        String outputDateTime1 = outputFormat1.format(date);
        String outputDateTime2 = outputFormat2.format(date);
        String outputDateTime3 = outputFormat3.format(date);

        String outputDateTime4 = outputFormat4.format(date);
        String outputDateTime5 = outputFormat5.format(date);
        String outputDateTime6 = outputFormat6.format(date);

        String outputDateTime7 = outputFormat7.format(date);
        String outputDateTime8 = outputFormat8.format(date);
        String outputDateTime9 = outputFormat9.format(date);

        System.out.println(outputDateTime1);
        System.out.println(outputDateTime2);
        System.out.println(outputDateTime3);

        System.out.println(outputDateTime4);
        System.out.println(outputDateTime5);
        System.out.println(outputDateTime6);

        System.out.println(outputDateTime7);
        System.out.println(outputDateTime8);
        System.out.println(outputDateTime9);

        }catch ( ParseException e){
            System.out.println("enter valid date and time");
        }
    }
}
