class OuterDemo{
    private int num1=10;
    private static int num2=20;

    static class staticInner {
        private int num3=30;
        private static int num4=40;

        public void printNum(){
            System.out.println(new OuterDemo().num1);
            System.out.println(OuterDemo.num2);
            System.out.println(num3);
            System.out.println(staticInner.num4);
        }
        
    }
}

class Demo2{
    public static void main(String[] args) {
        OuterDemo.staticInner obj=new OuterDemo.staticInner();
        obj.printNum();
    }
}