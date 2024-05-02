public class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 500;
    private double interestRate;

    public SavingsAccount(final int id, final double balance) {
        super(id, balance);
    }

    public void addInterest() {
        double interest = getBalance() * (1 + interestRate);
        setBalance(getBalance() + interest);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(final double rate) {
        this.interestRate = rate;
    }

    @Override
    public String toString() {
        return "SavingAccount(id=%d, balance=%s, interestRate=%s)".formatted(getId(), getBalance(), interestRate);
    }

    @Override
    public void withdraw(final double amount) {
        if (amount > 0 && getBalance() >= amount && (getBalance() - amount) >= MIN_BALANCE) {
            setBalance(getBalance() - amount);
            return;
        }
        super.withdraw(amount);
    }
}
