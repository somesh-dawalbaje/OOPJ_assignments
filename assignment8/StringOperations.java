class Demo5{
    public static void main(String[] args) {
        String s1="JAVAJAVA";
        String s2="VA";

        StringBuilder s=new StringBuilder(s1);
        for (int i = 0; i < s.length()-1; i+=3) {
            System.out.println(i);
            s=s.replace(i, i+1, s2);
            
        }
        System.out.println(s);
    }
}