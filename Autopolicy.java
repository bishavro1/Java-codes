public class AutoPolicy
{
  private String customerName;
  private int accountNumber;
  private String makeAndModel;
  private String state ;

  public AutoPolicy(String customerName, int accountNumber, String makeAndModel, String state)
  {
    this.customerName = customerName;
    this.accountNumber = accountNumber;
    this.makeAndModel = makeAndModel;
    this.state = state;
  }
  
  public void setCustomerName (String customerName)
  {
      this.customerName = customerName;
  }
  
  public String getCustomerName ()
  {
      return customerName;
  }

  public void setAccountNumber(int accountNumber)
  {
    this.accountNumber = accountNumber;
  }

  public int getAccountNumber()
  {
    return accountNumber;
  }

  public void setMakeAndModel(String makeAndModel)
  {
    this.makeAndModel = makeAndModel;
  }

  public String getMakeAndModel()
  {
    return makeAndModel;
  }

  public void setState(String state)
  {
    this.state = state; 
  }

  public String getState()
  {
    return state;
  }

  public boolean isNoFaultState()
  {
    boolean noFaultState;
    switch (getState())
    {
      case "MA":
      case "NJ":
      case "NY":
      case "PA":
        noFaultState = true;
        break;
      default:
        noFaultState = false;
        break;
    }
    return noFaultState;
  }

  public static void main(String[] args)
  {
    AutoPolicy policy = new AutoPolicy("A",1, "Audi", "NA");
    
    policy.setCustomerName ("Avro Deb");
    String customerName = policy.getCustomerName();
    System.out.println ("Customer Name: " + customerName);

    policy.setAccountNumber(7000);
    int accountNumber = policy.getAccountNumber();
    System.out.println("Account Number: " + accountNumber);

    policy.setMakeAndModel("Audi R8 Spyder");
    String makeAndModel = policy.getMakeAndModel();
    System.out.println("Make and Model: " + makeAndModel);

    policy.setState("NY");
    String state = policy.getState();
    System.out.println("State: " + state);

    boolean isNoFault = policy.isNoFaultState();
    System.out.println("Is No-Fault State: " + isNoFault);
  }
}
