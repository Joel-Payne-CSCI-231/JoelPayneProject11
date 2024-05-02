public class CheckingAccount extends Account {
    public CheckingAccount() {
        super();
    }

    public CheckingAccount(final int id, final double balance) {
        super(id, balance);
    }

    @Override
    public String toString() {
        return "CheckingAccount(id=%d, balance=%s)".formatted(getId(), getBalance());
    }

    @Override
    public void withdraw(final double amount) {
        if (amount > 0 && getBalance() >= amount && (getBalance() - amount) >= 500) {
            setBalance(getBalance() - amount);
            return;
        }
        super.withdraw(amount);
    }
}