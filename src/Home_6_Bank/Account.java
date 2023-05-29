package Home_6_Bank;

public class Account {

    private Client client;
    private int acc;

    public Account(Client client, int acc) {
        this.client = client;
        this.acc = acc;
    }

    public Client getClient() {
        return client;
    }

    public int getAcc() {
        return acc;
    }
}
