package Demo;

import java.util.Objects;

public class Transfert {
    private int amount;
    private String sender;
    private String receiver;
    private int password;

    public Transfert(int amount, String sender, String receiver, int password) {
        this.amount = amount;
        this.sender = sender;
        this.receiver = receiver;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Transfert{" +
                "amount=" + amount +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                '}';
    }

    public int getPassword() {
        return this.password;
    }

    public Transfert conf(int val){
        if (this.getPassword() == val)
        {
            return new Transfert(this.amount, this.sender, this.receiver, this.password);
        }

        return new Transfert(this.amount, this.sender, this.receiver, this.password);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transfert transfert = (Transfert) o;
        return amount == transfert.amount &&
                password == transfert.password &&
                Objects.equals(sender, transfert.sender) &&
                Objects.equals(receiver, transfert.receiver);
    }
}

