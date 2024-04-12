import java.util.*;

class comparableDemo implements Comparable<comparableDemo>{
   private int x;
   private String name;
   
   public comparableDemo(){

   }
   public comparableDemo(int x, String name){
    this.x=x;
    this.name=name;
   }

   public int getX(){
    return x;
   }

   public String getName(){
    return name;
   }

   @Override
   public int compareTo(comparableDemo other){
        return this.name.compareTo(other.name);
   }

   public String toString(){
    return this.name+" "+this.x;
   }
}

class sortByName implements Comparator<comparableDemo>{
    public int compare(comparableDemo o1, comparableDemo o2){
        return o1.getX()-o2.getX();
    }
}

class Main{
    public static void main(String[] args) {
        comparableDemo[] arr=new comparableDemo[3];
        arr[0]=new comparableDemo(5,"someh");
        arr[1]=new comparableDemo(8,"dinesh");
        arr[2]=new comparableDemo(7,"umesh");

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Comparator<comparableDemo> comparator=new sortByName();
        Arrays.sort(arr, comparator);
        System.out.println(Arrays.toString(arr));
    }
}