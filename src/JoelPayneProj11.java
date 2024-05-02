public class JoelPayneProj11 {
    public static void main(String[] args) {
        Account[] accounts = new Account[4];

        accounts[0] = new CheckingAccount(1, 1000);
        accounts[1] = new CheckingAccount(2, 2000);
        accounts[2] = new SavingsAccount(3, 1500);
        ((SavingsAccount) accounts[2]).setInterestRate(0.06);
        accounts[3] = new SavingsAccount(4, 2500);
        ((SavingsAccount) accounts[2]).setInterestRate(0.06);

        System.out.println("\nTesting failed cases for accounts\n");
        for (Account account : accounts) {
            System.out.println(account);
            System.out.println("Attempting to withdraw invalid amounts");
            account.withdraw(-50); // Attempt to withdraw negative amount
            account.withdraw(2000); // Attempt to withdraw more than balance
            System.out.println(account);

            if (account instanceof SavingsAccount) {
                System.out.println("Attempting to withdraw below minimum balance");
                account.withdraw(1000); // Attempt to withdraw below minimum balance
                System.out.println(account);
            }
            System.out.println("\n");
        }

        for (Account account : accounts) {
            account.deposit(100);
            account.withdraw(50);
            System.out.println(account);

            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).addInterest();
                System.out.println(account);
            }
        }
    }
}
