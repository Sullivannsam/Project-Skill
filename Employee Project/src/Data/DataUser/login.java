package Data.DataUser;

import Data.data;

import java.util.InputMismatchException;
import java.util.Scanner;


public class login {
    public void getLogin() throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        //Object instance data of logData
        data logData = new data("Sam", "google", 1000);
        try {
            //Try With User Input
            //User login Account
            System.out.print("Please Enter Your username: ");
            String logUsername = scan.nextLine();
            System.out.print("Please Enter Your Password: ");
            String logUserPassword = scan.nextLine();

            //Check if Users have an Account or empty option
            if(logUsername.isEmpty())
                System.out.println("Option can not be empty or blank! ");
            if(logUsername.equals(logData.getLogUsername()) && logUserPassword.equals(logData.getLogPassword())){
                logData.showDetail();
            }
            else{
                System.out.println("Account not found");
                System.out.println("Please try again!");
                return;
            }

            //Handler Error
        }catch(InputMismatchException e){
            System.out.println("Please try again and correct your Username and Password");
            scan.next();
        }
        scan.close();
    }
}
