package introducaopoo.construtores.application;

import introducaopoo.construtores.application.entities.Account;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class ProgramAccount {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there a initial deposit (y/n)? ");
        char answer = sc.next().charAt(0);
        if (answer == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }
        else {
            account = new Account(number, holder);
        }


        Account client1 = new Account(number, holder);

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account.toString());

        System.out.println();
        System.out.print("Enter a deposit value: ");
        account.deposit(sc.nextDouble());
        System.out.println("Update account data: ");
        System.out.println(account.toString());

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        account.withdraw(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(account.toString());

        sc.close();
    }
}
