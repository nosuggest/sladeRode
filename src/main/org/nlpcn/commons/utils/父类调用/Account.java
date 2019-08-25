package main.org.nlpcn.commons.utils.父类调用;

public class Account {
    private String actno;
    private Double balance;

    public Account() {
        System.out.println("无参构造方法");
    }

    public Account(String actno, Double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void say(){
        System.out.println("actno:"+this.actno+"    balance:"+this.balance);
    }
}
