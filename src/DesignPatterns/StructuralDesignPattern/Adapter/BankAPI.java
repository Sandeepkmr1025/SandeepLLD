package DesignPatterns.StructuralDesignPattern.Adapter;

public interface BankAPI {

    public void addBankAccount(BankAccount bankAccount);

    public double checkBalance(BankAccount bankAccount);
}
