import java.util.*;

class autoBoxingDemo{
   public static void main(String[] args) {
    float x=180.5f;
    Float c1=x;

    int x1=180;
    Integer x2=x1;

    //@SuppressWarnings
    Integer x3=180;
    Integer x4=180;
    System.out.println(x3==x4);
    System.out.println(x2);

    ArrayList<Integer> al=new ArrayList<>();
    //System.out.println(al.ensureCapacity(15));
   }
}