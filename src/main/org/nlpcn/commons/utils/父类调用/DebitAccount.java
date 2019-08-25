package main.org.nlpcn.commons.utils.父类调用;

public class DebitAccount extends Account {
    private double debit;

    public DebitAccount() {
    }

    public DebitAccount(String actno, Double balance, double debit) {
        super(actno, balance);
        this.debit = debit;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }
}
