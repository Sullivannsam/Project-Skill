import Admin.admin;
import CompanyController.Control;
import Data.DataUser.login;
import Data.DataUser.register;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    static String input;
    public static void choice(){

    }
    public static void main(String[] args)throws InterruptedException{
        //Project Date 30

        //Check if users are admin, account employee or just enroll
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Program");
        int attempt = 3;

        do {
            try {
                //Try With User input
                System.out.println("Are You an Admin? (Yes) or (No) Only!");
                System.out.print("Enter Your Option: ");
                input = scan.nextLine();
                //Check user if empty
                if (input.isEmpty() || !input.matches("^[a-zA-Z]+$"))
                    System.out.println("Please try again, option must not empty or blank! ");
                //Check user and accept from user
                //Check if the user is admin
                if (input.equalsIgnoreCase("yes")) {
                    admin logadmin = new admin();
                    logadmin.adminlogin();
                    //Access to Controller
                    Control newControl = new Control();
                    newControl.adminControl();
                } else if (input.equalsIgnoreCase("no")) {
                    //Check if user have an account before
                    System.out.println("Do you have an Account?: ");
                    String input = scan.nextLine();
                    //Check if user option are empty
                    if (input.isEmpty() || !input.matches("^[a-zA-Z]+$"))
                        System.out.println("Option must be not empty or blank!");
                    //Check if Users have an account
                    if (input.equalsIgnoreCase("yes")) {
                        login newLogin = new login();
                        newLogin.getLogin();
                        //Check if user wants to create an Account
                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("You are going to create an account below");
                        register newRegister = new register();
                        newRegister.getRegister();
                    } else {
                        attempt--;
                        System.out.println("Your attempt to log is: " + attempt);
                        System.out.println("Invalid Option");
                        //if user attempt are zero, exit the program
                        if(attempt == 0) {
                            System.out.println("Pleases try again next times! you are run out of times");
                            System.exit(0);
                        }
                    }
                }
                //Handler Error, prevent user type int in string
            } catch (InputMismatchException e) {
                System.out.println("Option can be in Number!");
                scan.nextLine();
            }
        }while(input.isEmpty() || attempt >= 0 );
        System.exit(0);

        scan.close();
    }
}
