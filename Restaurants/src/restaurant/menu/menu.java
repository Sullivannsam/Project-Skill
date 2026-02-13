package restaurant.menu;

import restaurant.loginForm.login.login;
import restaurant.loginForm.loginForm;
import restaurant.reservation.reservation;

import java.util.Scanner;

public class menu {
    public void showMenu() throws InterruptedException {

        Scanner scan = new Scanner(System.in);

            System.out.println("1. Reservation Table");
            System.out.println("2. Login Account");
            System.out.println("3. Exit App");
            System.out.println("Please Enter Your Option: ");
            int option = scan.nextInt();

            //All Object Instance
            reservation showReservation  = new reservation();
            loginForm getForm = new loginForm();


            switch(option){
                case 1 -> showReservation.getReservation();
                case 2 -> getForm.getFormLogin();
                case 3 -> System.exit(0);
                default -> System.out.println("Invalid Option! ");
            }


        scan.close();
    }
}
