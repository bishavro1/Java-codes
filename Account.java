public class Account
{
    private String name;
    private double balance;
    private String account;
    
    public Account(String name, String balance, String account)
    {
        this.name = name;
        double initialBalance = Double.parseDouble(balance);
        if (initialBalance > 0.0)
        {
            this.balance = initialBalance;
        }
        this.account = account;
    }
    
    public void deposit(double depositAmount)
    {
        if (depositAmount > 0.0)
        {
            balance = balance + depositAmount;
        }
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setAccount(String account)
    {
        this.account = account;
    }
    
    public String getAccount()
    {
        return account;
    }
    
    public static void main(String[] args)
    {
        Account myAccount = new Account("Avro Deb", "2500.0", "Personal");
        
        // Printing initial account information
        System.out.println("Account Holder: " + myAccount.getName());
        System.out.println("Account Type: " + myAccount.getAccount());
        System.out.println("Initial Balance: $" + myAccount.getBalance());
        
        myAccount.deposit(2500.0);
        
        System.out.println("Updated Balance after deposit: $" + myAccount.getBalance());
    }
}
