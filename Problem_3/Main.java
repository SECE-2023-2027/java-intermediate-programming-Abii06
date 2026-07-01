package Problem_3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();
        Bank bank = new Bank(accountNumber, accountHolderName, balance);
        System.out.print("Enter Deposit Amount: ");
        double depositAmount = sc.nextDouble();
        bank.deposit(depositAmount);
        System.out.print("Enter Withdraw Amount: ");
        double withdrawAmount = sc.nextDouble();
        bank.withdraw(withdrawAmount);
        System.out.println(bank.getBalance());

        sc.close();
    }
}
