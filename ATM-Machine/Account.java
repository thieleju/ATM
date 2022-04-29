
public class Account {
   private String username;
   private String accountNumber;
   private String pin;
   private double availableBalance;
   private double totalBalance;
   private boolean admin;

   public Account(String username, String accountNumber, String pin, double availableBalance, double totalBalance,
         boolean isadmin) {
      this.username = username;
      this.accountNumber = accountNumber;
      this.pin = pin;
      this.availableBalance = availableBalance;
      this.totalBalance = totalBalance;
      this.admin = isadmin;
   }

   public boolean validatePIN(String userPIN) {
      if (userPIN == pin)
         return true;
      else
         return false;
   }

   public void credit(double amount) {
      totalBalance += amount;
   }

   public void debit(double amount) {
      availableBalance = availableBalance - amount;
      totalBalance = totalBalance - amount;
   }

   public double getAvailableBalance() {
      return availableBalance;
   }

   public double getTotalBalance() {
      return totalBalance;
   }

   public String getAccountNumber() {
      return accountNumber;
   }

   public String getPin() {
      return getPin();
   }

   public String getUsername() {
      return username;
   }

   public boolean getAdmin() {
      return admin;
   }
}