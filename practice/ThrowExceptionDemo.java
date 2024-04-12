class ThrowExceptionDemo{
    public static void main(String[] args) {
        int num1=3;
        try{
            if(num1%2!=0)
                throw new Exception("number is odd");
            System.out.println("number is even");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}