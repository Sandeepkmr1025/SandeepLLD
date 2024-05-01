package DesignPatterns.StructuralDesignPattern.Adapter;

public interface YesBankAPI {

    String addBankAccount(String accountId, String name);
    Balance checkBalance(BankAccount bankAccount);
}
