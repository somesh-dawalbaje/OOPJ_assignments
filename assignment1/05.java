import java.util.*;

class Demo3{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        char ch=scanner.next().charAt(0);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='U' || ch=='O'){
                System.out.println("Vowel");
            }else{
                System.out.println("consonant");
            }
            
        }else
            System.out.println("enter a letter");
    }
}