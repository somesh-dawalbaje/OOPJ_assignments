class InstanceCounter{
    private static int counter=0;
    public InstanceCounter(){
        counter++;
    }
    public int getInstanceCount(){
        return counter;
    }
}

class Client{
    public static void main(String[] args) {
        InstanceCounter obj1=new InstanceCounter();
        System.out.println(obj1.getInstanceCount());
        InstanceCounter obj2=new InstanceCounter();
        System.out.println(obj2.getInstanceCount());

    }
}