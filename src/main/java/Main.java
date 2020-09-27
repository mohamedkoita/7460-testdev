import Demo.Transfert;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        Transfert trans = new Transfert(10000, "Maman", "Mohamed", 230);

        System.out.print("Veuillez entrer le mot de passe du transfert");
        int passwd = myObj.nextInt();

        int geti = trans.getPassword();


        if ( geti == passwd) {
            System.out.print(trans);
        } else {
            System.out.print("Transfert inexistant");
        }







    }
}
