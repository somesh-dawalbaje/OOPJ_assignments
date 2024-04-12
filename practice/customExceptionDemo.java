class customException extends Exception{
    public customException(){
        super("u r minor");
    }
}

class Main{
    public static void main(String[] args) {
        int a=10;
        try{
            if(a<18)
                throw new customException();
        }catch(customException e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}