package restaurant;

import restaurant.loginForm.loginForm;
import restaurant.menu.menu;
import restaurant.reservation.reservation;

public class Main{
    public static int checkCode = 0;

    public static void main(String[] args) throws InterruptedException{

        //Object Instance
        menu displayMenu = new menu();
        reservation displayReservation = new reservation();
        loginForm displayLoginForm = new loginForm();


        System.out.println(
                """
                          ____           _                              _      \s
                         |  _ \\ ___  ___| |_ __ _ _   _ _ __ __ _ _ __ | |_ ___\s
                         | |_) / _ \\/ __| __/ _` | | | | '__/ _` | '_ \\| __/ __|
                         |  _ <  __/\\__ \\ || (_| | |_| | | | (_| | | | | |_\\__ \\
                         |_| \\_\\___||___/\\__\\__,_|\\__,_|_|  \\__,_|_| |_|\\__|___/
                        """
        );
        System.out.println("Welcome to Restaurants");
        System.out.println(" ");

        displayMenu.showMenu();



    }
}