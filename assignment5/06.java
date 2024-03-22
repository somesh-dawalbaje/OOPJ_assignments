import java.util.*;

class BankManagement{
    private String customerName;
    private int accountNumber;
    private double accountBalance;

    public BankManagement(String customerName, int accountNumber){
        this.customerName=customerName;
        this.accountNumber=accountNumber;
        this.accountBalance=0.0d;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public int getaAccountNumber(){
        return this.accountNumber;
    }

    public double getAccountBalance(){
        return this.accountBalance;
    }

    public void deposit(double accountBalance){
        this.accountBalance+=accountBalance;
        System.out.println("amount "+accountBalance+" has been credited");
    }

     public void withdraw(double accountBalance){
        if(accountBalance<=this.accountBalance){
            this.accountBalance-=accountBalance;
            System.out.println("amount "+accountBalance+" has been dedited");
        }
        else
            System.out.println("insufficient balance");
    }
}

class AccountHolder{
    private static Map<Integer, BankManagement> hm=new HashMap<>();
    private static int accountCounter=1;
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       
       while (true) {
            System.out.println("Welcome to the Bank Management System");
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Display account balance");
            System.out.println("5. Display account holder's information");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int x = scanner.nextInt();

                switch (x) {
                    case 1:
                        createAccount();
                        break;
                    case 2:
                        depositMoney();
                        break;
                    case 3:
                        withdrawMoney();
                        break;
                    case 4:
                        displayAccountBalance();
                        break;
                    case 5:
                        displayAccountInfo();
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

        }  
    }

    

    private static void createAccount(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account holder's name: ");
        String customer1=scanner.nextLine();
        BankManagement user1=new BankManagement(customer1, accountCounter);
        hm.put(accountCounter, user1);
        System.out.println("Account created successfully. Account number: " + accountCounter);
        accountCounter++;
    }

    private static void depositMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        if (hm.containsKey(accountNumber)) {
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();
            hm.get(accountNumber).deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void withdrawMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        if (hm.containsKey(accountNumber)) {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            hm.get(accountNumber).withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void displayAccountBalance() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        if (hm.containsKey(accountNumber)) {
            System.out.println("Current balance: " + hm.get(accountNumber).getAccountBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void displayAccountInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        if (hm.containsKey(accountNumber)) {
            BankManagement user = hm.get(accountNumber);
            System.out.println("Account holder's name: " + user.getCustomerName());
            System.out.println("Current balance: " + user.getAccountBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
}