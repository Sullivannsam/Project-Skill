package Data.DataUser;

import Data.data;

import java.util.InputMismatchException;
import java.util.Scanner;


public class login {

    public void getChoice() {
        Scanner scan = new Scanner(System.in);
        //Passing User input does not have an account
        System.out.print("Do you have an Account?: ");
        String input = scan.nextLine();
        switch (input) {
            case "Yes", "yes":
                getLogin();
                break;
            case "No", "no":
                register Register = new register();
                Register.getRegister();
                break;
            default:
                System.out.println("PLease try again");
                break;
        }
    }

    public void getLogin() throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        //Object instance data of logData
        data logData = new data("Sam", "google");
        try {
            //Try With User Input
            //User login Account
            System.out.print("Please Enter Your username: ");
            String username = scan.nextLine();
            System.out.print("Please Enter Your Password: ");
            String userPassword = scan.nextLine();
            //Check if Users have an Account
            logData.getLogUsername(username);
            logData.getLogPassword(userPassword);
        }catch(InputMismatchException e){
            //Handler Error
            System.out.println("Please try again and correct your Username and Password");
            scan.next();
        }

        scan.close();
    }
}
