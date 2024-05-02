public class Account {
    private double balance;
    private int id;

    public Account() {
        this.id = 0;
        this.balance = 0.0;
    }

    public Account(final int id, final double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void deposit(final double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(final double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Account(id=%d, balance=%s)".formatted(id, balance);
    }

    public void withdraw(final double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.printf("Unable to withdraw %s. Insufficient funds or invalid withdrawal amount.%n", amount);
        }
    }
}
