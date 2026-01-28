package EmployeeEnroll.Information.EmployeeInformation.Data;

import java.util.Scanner;

public class login {

    public void getLogin(){
        Scanner scan = new Scanner(System.in);

            //
            data loginAdmin = new data("Sullivann Sam", "Admin", "Admin@google.com", 1001, (short) 20);

            System.out.println("Enter Your Username: ");
            String username = scan.nextLine();
            System.out.println("Enter Your Email: ");
            String email = scan.nextLine();
            System.out.println("Enter Your Password: ");
            String password = scan.nextLine();

            //Check if User has Account or Admin
            if(username.equals(loginAdmin) && ){


        }


        scan.close();
    }
}
