import java.util.*;



class BankAccount implements Comparable<BankAccount>{
    private int accountNo;
   
    public BankAccount(int accountNo){
        this.accountNo=accountNo;
    }

    @Override
    public int compareTo(BankAccount o) {
        // TODO Auto-generated method stub
        return this.accountNo-o.accountNo;
    }

    public int getAccountNo() {
        return accountNo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + accountNo;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BankAccount other = (BankAccount) obj;
        if (accountNo != other.accountNo)
            return false;
        return true;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    @Override
    public String toString() {
        return String.format("%-10d",this.accountNo);
    }  
    
}

class AccountName{
    private String accountName;

    public AccountName(){     
    }

    public String getAccountName() {
        return accountName;
    }

    public AccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public String toString() {
        return String.format("%-10s",this.accountName);
    }  
    
}

class hashMapDemo{

    public static void main(String[] args) {
        Map<BankAccount, AccountName> hm = new HashMap<>();
        

        hm.put(new BankAccount(123), new AccountName("somesh"));
        hm.put(new BankAccount(122), new AccountName("omkesh"));
        hm.put(new BankAccount(124), new AccountName("umesh"));

        System.out.println(hm);


        Set<BankAccount> hs=new HashSet<>(hm.keySet());

        System.out.println(hs);

        List<AccountName> al=new ArrayList<>(hm.values());

        System.out.println(al);



    }

}