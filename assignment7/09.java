class ArrayDemo1{
    public static void main(String[] args) {
        int n=6;
        for (int i = 1; i <=n; i++) {
            if(i%2!=0)
               System.out.print(i*(i*i)+" ");
            else
                System.out.print(i*i+" ");
        }
        System.out.println();
    }
}