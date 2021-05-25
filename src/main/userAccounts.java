package main;

public class userAccounts {
    private String accName;
    private int accountNumber, money, numAccounts;

    userAccounts (String name, int accNum, int numAcc, int mon){
        accName = name;
        accountNumber = accNum;
        money = mon;
        numAccounts = numAcc;
    }

    public void withdrawMoney(int request) {
        money -= request;
    }

    public void depositMoney(int money) {
        this.money += money;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getNumAccounts() {
        return numAccounts;
    }

    public int getMoney() {
        return money;
    }

    public String getAccName() {
        return accName;
    }

    @Override
    public String toString() {
        return "userAccounts{" +
                "accName='" + accName + '\'' +
                ", accountNumber=" + accountNumber +
                ", money=$" + money +
                ", numAccounts=" + numAccounts +
                '}';
    }
}
