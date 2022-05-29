import java.util.Objects;

public class User {
    String name;
    String registrationDate;
    Boolean subscription;
    Double balance;
    int ip;
    static int LastIP=0;

    public User(String name, String registrationDate, int ip) {
        this.name = name;
        this.registrationDate = registrationDate;
        this.ip = ip;
        LastIP++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return ip == user.ip && name.equals(user.name) && registrationDate.equals(user.registrationDate) && subscription.equals(user.subscription) && Objects.equals(balance, user.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, registrationDate, subscription, balance, ip);
    }
}

