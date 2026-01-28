package User.DataUser;

import User.Data.data;

import static App.app.app;
import java.util.Scanner;

public class userLogin {
    public String getLoginAccount(){
        //Input User Account
        System.out.println("Enter Your Name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Enter Your Email: ");
        String email = scan.nextLine();
        System.out.println("Enter Your Password: ");
        String password = scan.nextLine();

        //Object data Instance of loginUser
        data loginUser = new data("Sam", (short) 20, (short) 2006, "Sam@google.com", "google12", 1234567);

        //Check Condition User Login
        if(name.equals(loginUser.getName())){
            System.out.println("Welcome back!");
        }
        scan.close();

        return app;
    }
}
