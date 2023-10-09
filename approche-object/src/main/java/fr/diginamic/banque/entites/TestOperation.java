package fr.diginamic.banque.entites;

import java.time.Instant;

public class TestOperation {
    public static void main(String[] args) {
        Compte account = new Compte(1396489, 237);

        System.out.printf("Account balance before operations: £%.2f", account.getBalance());
        System.out.println();

        Operation loan = new Debit(Instant.now().toString(), 10000.0);
        Operation rent = new Credit(Instant.now().toString(), 594.34);
        Operation glasses = new Credit(Instant.now().toString(), 77.37);
        Operation cancelledPurchase = new Debit(Instant.now().toString(), 99.99);

        Operation[] operations = {loan, rent, glasses, cancelledPurchase};

        double balance = account.getBalance();
        double totalOperation = 0;
        for (Operation operation : operations) {
            System.out.println(operation.toString());
            switch (operation.getType()) {
                case "CREDIT":
                    totalOperation -= operation.amount;
                    balance -= operation.amount;
                    System.out.printf("Account balance after operations: £%.2f", balance);
                    System.out.println();
                    break;
                case "DEBIT":
                    balance += operation.amount;
                    totalOperation += operation.amount;
                    System.out.printf("Account balance after operations: £%.2f", balance);
                    System.out.println();
                    break;
            }

            System.out.println("-----------------------------\n");
        }

        account.setBalance(balance);

        System.out.println(String.format("Account balance: £%.2f", account.getBalance()));
        String sign = totalOperation > 0 ? "+" : "-";
        System.out.println(String.format("Total operations: %s£%.2f", sign, totalOperation));
    }
}
