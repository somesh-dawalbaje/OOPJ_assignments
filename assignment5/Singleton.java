import java.util.*;

class Singleton{
    
    private int num1;

    public void setNum1(int num1){
        this.num1=num1;
        System.out.println(System.identityHashCode(num1));
    }

    private  Singleton(){
        System.out.println("Inside the constructor");
        System.out.println();
    }

    private static Singleton instance=null;
    public static Singleton getInstance(){
        if(instance==null)
            instance=new Singleton();
        return instance;
    }
}


class Demo{
    public static void main(String[] args) {
        Singleton s1=Singleton.getInstance();
        s1.setNum1(10);
        Singleton s2=Singleton.getInstance();
        s2.setNum1(20);
        System.out.println(s1);
        System.out.println(s2);
    }
}