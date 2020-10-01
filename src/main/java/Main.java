import Demo.Transfert;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        Transfert trans = new Transfert(10000, "Mama", "Mohamed", 230);

        System.out.print("SVP entre le mot de passe du transfer");
        int passwd = myObj.nextInt();

        int gets = trans.getPassword();


        if ( gets == passwd) {
            System.out.print(trans);
        } else {
            System.out.print("Transfer missed");
        }







    }
}
