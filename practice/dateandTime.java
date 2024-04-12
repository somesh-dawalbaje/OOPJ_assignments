import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.*;

class demo{
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        cal.set(1900, 2, 30, 13, 15, 20);
        Date date = cal.getTime();

        SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss a");
        String s=sdf.format(date);
        System.out.println(s);

        double payment=155.5d;
        String us=NumberFormat.getCurrencyInstance(new Locale("EN", "IN")).format(payment);
        System.out.println(us);

        String s1="He is a very very good boy, isn't he?";
        s1=s1.trim();
        String[] tokens=s1.split("[!,?._'@\\s]+");
        System.out.println(tokens.length);
        for (String string : tokens) {
            System.out.println(string);
        }

        String s2="welcometojava";
        int k=3;

        String smallest=s2.substring(0,k);
        String largest=s2.substring(0,k);

        for(int i=0; i<s2.length()-k+1; i++){
            String s3=s2.substring(i, i+k);
            if(s3.compareTo(smallest)<0)
                smallest=s3;
            if(s3.compareTo(smallest)>0)
                largest=s3;
        }

        System.out.println(smallest+" "+largest);


    }

}