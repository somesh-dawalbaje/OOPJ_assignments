class A{
    private int x;
    public A(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }
    public A(){
        System.out.println("constructor A");
    }

    public void greet(){
        System.out.println("from method A");
    }

    public void greet1(){
        System.out.println("from method2 A");
    }
}

class B extends A{
    private int y;
    public B(int y){
        super(y);
        this.y=y;
    }
    public B(){
        System.out.println("constructor B");
    }

    public void greet(){
        System.out.println("from method B");
    }

    public void fun(){
        System.out.println("from method2 B");
    }
    public String toString(){
        return getX()+" from A "+this.y+" from B";
    }
}

class Demo4{
    public static void main(String[] args) {

        System.out.println("in main");
        A a = new A();
        a.greet();
        B b=new B();
        b.greet();
        A a1=new B(1);   //only for super class methods, using upcasting 
        a1.greet();
        B b1=(B)a1;    //we can call both but it is mostly used for subclass methods and it is called as downcasting, done after upcasting
        b1.greet();
        b1.greet1();
        System.out.println(b1.toString());
        System.out.println("end main");

    }
}