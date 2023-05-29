package Home_6_Bank;

import java.util.*;

public class Bank {
    static HashMap<Account, Integer> balance = new HashMap<>();

    public static List<Account> getAccounts(Client client) {
        List<Account> listAcc = new ArrayList<>();
        for (Account acc : balance.keySet()) {
            if (acc.getClient().equals(client)) {
                listAcc.add(acc);
                System.out.println("Счет: " + acc.getAcc());
            }
        }
        return listAcc;
    }

    public static Client findClient(Account account) {
        System.out.println("Клиент: " + account.getClient().getName());
        return account.getClient();
    }


    public static void main(String[] args) {

        Client clientPetay = new Client("Петя", 20);
        Client clientVasay = new Client("Вася", 16);
        Client clientTanay = new Client("Таня", 35);
        Client clientMarina = new Client("Марина", 25);
        Client clientDenis = new Client("Денис", 19);

        Account acc1 = new Account(clientPetay, 1111);
        Account acc2 = new Account(clientPetay, 2222);
        Account acc3 = new Account(clientDenis, 3333);
        Account acc4 = new Account(clientVasay, 4444);
        Account acc5 = new Account(clientTanay, 5555);
        Account acc6 = new Account(clientMarina, 6666);
        Account acc7 = new Account(clientDenis, 7777);
        Account acc8 = new Account(clientPetay, 8888);
        Account acc9 = new Account(clientTanay, 9999);

        balance.put(acc1, 505);
        balance.put(acc2, 405);
        balance.put(acc3, 500);
        balance.put(acc4, 501);
        balance.put(acc5, 345);
        balance.put(acc6, 385);
        balance.put(acc7, 202);
        balance.put(acc8, 108);
        balance.put(acc9, 415);

        getAccounts(clientDenis);
        findClient(acc2);


    }
}
