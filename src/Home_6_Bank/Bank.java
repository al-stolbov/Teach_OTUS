package Home_6_Bank;

import java.util.*;


public class Bank {
    private static Map<Client, Set<Account>> bank = new HashMap<>();

    public static Set<Account> getAccounts(Client client) {
        return bank.get(client);
    }

    public static Client findClient(Account account) {
        return bank.entrySet().parallelStream()
                .filter(f ->
                        f.getValue().contains(account))
                .findFirst().map(Map.Entry::getKey)
                .get();
    }


    public static void main(String[] args) {

        Client clientPetay = new Client("Петя", 20);
        Client clientVasay = new Client("Вася", 16);
        Client clientTanay = new Client("Таня", 35);
        Client clientMarina = new Client("Марина", 25);
        Client clientDenis = new Client("Денис", 19);

        Account acc1 = new Account(1001);
        Account acc2 = new Account(1002);
        Account acc3 = new Account(1003);
        Account acc4 = new Account(1004);
        Account acc5 = new Account(1005);
        Account acc6 = new Account(1006);
        Account acc7 = new Account(1007);
        Account acc8 = new Account(1008);
        Account acc9 = new Account(1009);

        bank.put(clientPetay, new HashSet<>(List.of(acc1, acc2)));
        bank.put(clientVasay, new HashSet<>(List.of(acc3, acc4)));
        bank.put(clientTanay, new HashSet<>(List.of(acc5, acc6)));
        bank.put(clientMarina, new HashSet<>(List.of(acc7, acc8)));
        bank.put(clientDenis, new HashSet<>(List.of(acc9)));


        System.out.println(findClient(acc2).getName());

        getAccounts(new Client("Петя", 20)).forEach(i -> System.out.println(i.getAcc()));


    }
}
