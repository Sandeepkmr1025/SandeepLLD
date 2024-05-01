package DesignPatterns.StructuralDesignPattern.Adapter;

public class PhonePe {

    private final BankAPI bankAPI;

    public PhonePe(BankAPI bankAPI)
    {
        this.bankAPI = bankAPI;
    }

    public double performBankOperation()
    {
        BankAccount bankAccount = new BankAccount("54454564", "Sandeep");
        bankAPI.addBankAccount(bankAccount);
        double balance = bankAPI.checkBalance(bankAccount);
        System.out.println("Account balance is - "+balance);
        return balance;
    }
}
