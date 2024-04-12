import java.util.*;

class Singleton{
    private  Singleton(){  
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
        
        Singleton s2=Singleton.getInstance();

    }
}