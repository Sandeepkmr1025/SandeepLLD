package DesignPatterns.StructuralDesignPattern.Adapter;

public class YesBankAPIImpl implements YesBankAPI{

    @Override
    public String addBankAccount(String accountId, String name) {
        System.out.println("Added bank account via Yes Bank API");
        return accountId;
    }

    @Override
    public Balance checkBalance(BankAccount bankAccount) {
        return new Balance(1000);
    }
}
