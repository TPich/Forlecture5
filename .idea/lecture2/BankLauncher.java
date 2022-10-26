package lecture2;

import lecture2.Bank;

public class BankLauncher {
    public static void main(String[] args) {
        Bank bankVariable = new Bank();
        bankVariable.checkBalance();
        bankVariable.deposit(100000);
        bankVariable.checkBalance();
        bankVariable.withdraw(10000);
        bankVariable.checkBalance();
    }
}
