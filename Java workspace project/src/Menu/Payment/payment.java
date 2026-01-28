package Menu.Payment;

import static App.app.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class payment {
    static int choice;
    public String payMethod(){
        Scanner payment = new Scanner(System.in);
        System.out.println("Which payment method do you want to? :");
        System.out.println("1. Pay with Qr");
        System.out.println("2. Pay with Case");
        System.out.println("Please Input your payment method: ");
        try { //Try and warning user from type string and convert string into number
            choice = payment.nextInt();
            switch (choice) {
                case 1:
                    payQr newQr = new payQr();
                    newQr.getQr();
                    break;
                case 2:
                    payCase newCase = new payCase();
                    newCase.getCase();
                    break;
                default:
                    System.out.println("Invalid Choice Sorry!");
                    break;
            }
        }catch(InputMismatchException e){
            System.out.println("Can not Convert String into number!");
            payment.next();
        }
        payment.close();

        return app;
    }
}
