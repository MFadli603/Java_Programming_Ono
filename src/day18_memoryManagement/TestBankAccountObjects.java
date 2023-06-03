package day18_memoryManagement;

public class TestBankAccountObjects {

    public static void main(String[] args) {

        BankAccount obj1 = new BankAccount();
        obj1.setInfo("Oyunaa", 3748374);
        System.out.println(obj1);

        obj1.deposit(1000);
obj1.checkBalance();
    obj1.deposit(1);
    obj1. checkBalance();

    obj1.withdraw(100);
    obj1.checkBalance();

        System.out.println("----------------------");

        BankAccount account1 = new BankAccount();
        BankAccount account2= new BankAccount();

        account1.setInfo("Jenny", 983493);

        account2.setInfo("Nick",200099);
    }
}
