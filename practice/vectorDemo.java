import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

class vectorDemo{
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);

        Iterator<Integer> itr=v.iterator();

        Integer x;
        while (itr.hasNext()) {
            x=itr.next();

            if(x==20)
                v.remove(x);
        }
    }
}