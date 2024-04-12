class OverriderDemo{
    public void print(int i){
        System.out.println("int");
    }

    public void print(long i){
        System.out.println("long");
    }

    public void print(byte i){
        System.out.println("byte");
    }
}




class Main{
    public static void main(String[] args) {
        OverriderDemo o1=new OverriderDemo();
        o1.print(1);
    }
}