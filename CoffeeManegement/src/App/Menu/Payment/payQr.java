package Menu.Payment;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class payQr {
    public void getQr(){
        Random random = new Random();
        int randomQr = 1000 + random.nextInt(9000);
        System.out.println("Please input the Generate Code Number into Your bank to confirm the price!");
        System.out.println("This is Qr Generate: " + randomQr);
        System.out.println("Please Enter Qr code to confirm your payment: ");
        Scanner scanQr = new Scanner(System.in);
        try {
            int Qrpin = scanQr.nextInt();
            if (Qrpin == randomQr) {
                System.out.println("Your Process payment is done!");
            } else {
                System.out.println("Please try again!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Can not Convert String into number!");
            System.out.println("Please try a new one");
            scanQr.next();
        }
        scanQr.close();
    }
}
