package Admin;


import Data.DataAdmin.adminInfo;
import java.util.InputMismatchException;
import java.util.Scanner;


public class admin {
    public void adminlogin(){

        adminInfo logAdminInfo = new adminInfo();
        Scanner scan = new Scanner(System.in);
        int attempt = 3;

        //Admin dashboard login
        System.out.println("Welcome to Login Admin dashboard");

        do {
            try { //Try With Admin login site
                System.out.print("Enter Username: ");
                String adminName = scan.nextLine();
                System.out.print("Enter Password: ");
                String adminPassword = scan.nextLine();
                if(adminName.isEmpty() && adminPassword.isEmpty())
                    System.out.println("Username or password is empty");
                //Check if username of admin and password are correct
                if (adminName.equals(logAdminInfo.getName()) && adminPassword.equals(logAdminInfo.getPassword())) {
                    System.out.println("Welcome to admin dashboard");
//                    System.exit(0);
                    return ;
                } else {
                    attempt--;
                    System.out.println("Your attempt to log: " + attempt);
                    System.out.println("Please try again!");
//                    scan.nextLine();
                }

            } catch (InputMismatchException e) {
                //Handler Error
                System.out.println("Please input the correct name of password!");
                scan.next();
            }
        }while(attempt > 0);
        if (attempt == 0)
            System.exit(0);


        scan.close();
    }
}

