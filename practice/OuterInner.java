class Outer{
    private int num1=10;

    class inner{
        private int num1=20;

        public void printNum1(){
            int num1=30;
            System.out.println("num1 : "+Outer.this.num1);
            System.out.println("num1 : "+this.num1);
            System.out.println("num1 : "+num1);
        }
    }
}

class Demo1{
    public static void main(String[] args) {
        
        Outer.inner obj=new Outer().new inner();
        obj.printNum1();
    }
}