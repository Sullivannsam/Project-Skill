package restaurant.loginForm;

import restaurant.loginForm.login.login;
import restaurant.loginForm.register.register;
import restaurant.menu.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class loginForm {
    public void getFormLogin() throws InterruptedException{

        Scanner scan = new Scanner(System.in);

            System.out.println("This is a Login form: ");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Back to menu");
            System.out.println("Enter Your Option: ");
            int option = scan.nextInt();

            //Object Instance
            login setLogin = new login();
            register setRegister = new register();
            menu returnMenu = new menu();

            try {
                switch (option) {
                    case 1 -> setLogin.getLogin();
                    case 2 -> setRegister.getRegister();
                    case 3 -> returnMenu.showMenu();
                    default -> System.out.println("Invalid Option");

                }
            }
            catch(InputMismatchException e){
                System.out.println("Can not convert Character into a Number");
            }

        scan.close();
    }
}
