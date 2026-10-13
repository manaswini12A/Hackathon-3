public class PersonalBankingLedger {
    String name, accNum;
    double balance, deposits, withdrawals;

    public PersonalBankingLedger(String n, String acc, double bal) {
        name = n; accNum = acc; balance = bal;
        System.out.println("Account Holder Name : " + name + "\nAccount Number : " + accNum + "\nInitial Balance : Rs. " + bal);
    }

    public void deposit(double amt) {
        balance += amt; deposits += amt;
        System.out.println("\nDeposit Amount : Rs. " + amt + "\nTransaction Status : Deposit Successful\nUpdated Balance : Rs. " + balance);
    }

    public void withdraw(double amt) {
        System.out.println("\nWithdrawal Amount : Rs. " + amt);
        if (amt > balance) System.out.println("Transaction Status : Insufficient Balance");
        else {
            balance -= amt; withdrawals += amt;
            System.out.println("Transaction Status : Withdrawal Successful\nUpdated Balance : Rs. " + balance);
        }
    }

    public void verifyAndSummary(String checkName) {
        System.out.println("\nAccount Number : " + accNum + "\nTotal Deposits : Rs. " + deposits + "\nTotal Withdrawals : Rs. " + withdrawals + "\nFinal Balance : Rs. " + balance);
        String match = name.equalsIgnoreCase(checkName.trim()) ? "Names Match" : "Names Mismatch";
        System.out.println("Account Holder Verification: " + match);
    }

    public static void main(String[] args) {
        PersonalBankingLedger acc = new PersonalBankingLedger("RAVI KUMAR", "1234567890", 10000);
        acc.deposit(5000);
        acc.withdraw(2000);
        acc.withdraw(20000);
        acc.verifyAndSummary("ravi kumar");
    }
}
