public class Account {
    private String name;
    private double balance;
    private String accountType;
    
    public Account(String name, double balance, String accountType) {
        this.name = name;
        
        if (balance > 0.0) {
            this.balance = balance;
        }
        
        this.accountType = accountType;
    }
    
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAccountType() { // Changed the method name to be more descriptive
        return accountType;
    }
    
    public static void main(String[] args) {
        Account myAccount = new Account("Avro Deb", 2500.0, "Personal");
        
        // Printing initial account information
        System.out.println("Account Holder: " + myAccount.getName());
        System.out.println("Account Type: " + myAccount.getAccountType());
        System.out.println("Initial Balance: $" + myAccount.getBalance());
        
        myAccount.deposit(2500.0);
        
        System.out.println("Updated Balance after deposit: $" + myAccount.getBalance());
    }
}
