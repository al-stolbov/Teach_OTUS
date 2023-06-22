package Home_6_Bank;

import java.util.Objects;

public class Account {
    private final int acc;

    public Account(int acc) {
        this.acc = acc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return acc == account.acc;
    }

    @Override
    public int hashCode() {
        return Objects.hash(acc);
    }

    public int getAcc() {
        return acc;
    }
}
