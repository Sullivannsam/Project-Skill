package restaurant.checkReservation;

import restaurant.reservation.reservation;

import java.util.Scanner;

public class checkReservation {
    public void serviceReservation(){

        Scanner scan = new Scanner(System.in);
        reservation getReservation = new reservation();

            System.out.println("Please verify your Reservation code: ");
            int checkCode = scan.nextInt();

            if(checkCode == getReservation(getReservation())){

            }

        scan.close();
    }
}
