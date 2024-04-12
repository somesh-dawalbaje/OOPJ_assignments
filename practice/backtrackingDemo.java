class backtrackingDemo{
    
    public static void permutationsString(String s,String res){
        if(s.length()==0){
            System.out.println(res);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            res=s.substring(0, i)+s.substring(i+1);
            permutationsString(s+ch, res);
        }
    }
    public static void main(String[] args) {
        permutationsString("abc", "");
    }
}