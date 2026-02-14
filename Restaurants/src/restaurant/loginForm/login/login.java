package restaurant.loginForm.login;

import restaurant.loginForm.Data.data;
import restaurant.menu.menu;

import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class login {

        static int attempt = 0;

    public void getLogin() throws InterruptedException {

        Scanner scan = new Scanner(System.in);


        System.out.println("Please enter your username: ");
        String username = scan.nextLine();

        System.out.println("Please enter your email: ");
        String email = scan.nextLine();

        System.out.println("Please enter your password: ");
        String password = scan.nextLine();

        //Object Instance
        data dataLogin = new data(username, email, password);
        menu Menu = new menu();

        while((!username.equals(dataLogin.logData())) &&
                (!password.equals(dataLogin.logData())) &&
                (!email.equals(dataLogin.logData()))) {

            attempt++;

            //Check if Correct login
            if (username.isEmpty() && password.isEmpty() && email.isEmpty())
                System.out.println("Input must not empty! ");

            if (username.equals(dataLogin.logData()) && email.equals(dataLogin.logData()) && password.equals(dataLogin.logData())) {
                Menu.showMenu();
            } else {
                System.out.println("Please fill in the blank");

                if(attempt >= 3)
                    System.exit(0);
            }
        }
        scan.close();

    }
}
