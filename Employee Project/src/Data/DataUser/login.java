package Data.DataUser;

import Data.data;

import java.util.InputMismatchException;
import java.util.Scanner;


public class login {
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
