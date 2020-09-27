package Demo;

public class Transfert {
    private int amount;
    private String sender;
    private String receiver;
    private String password;

    public Transfert(int amount, String sender, String receiver, String password) {
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
}
