package DesignPatterns.StructuralDesignPattern.Adapter;

public class YesBankAdapter implements BankAPI{

    private final YesBankAPI yesBankAPI;

    public YesBankAdapter(YesBankAPI yesBankAPI)
    {
        this.yesBankAPI = yesBankAPI;
    }
    @Override
    public void addBankAccount(BankAccount bankAccount) {

        String accountId = yesBankAPI.addBankAccount(bankAccount.getAccountNumber(), bankAccount.getAccountHolderName());
        System.out.println("Added bank account successfully");
    }

    @Override
    public double checkBalance(BankAccount bankAccount) {
        Balance balance = yesBankAPI.checkBalance(bankAccount);
        return balance.getAmount();
    }


}
