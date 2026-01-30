import Admin.admin;
import Data.DataUser.login;

import java.util.Scanner;


public class Main{
    public static void choice(){

    }
    public static void main(String[] args)throws InterruptedException{
        //Project Date 30
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Program");
        System.out.println("Are You an Admin?");
        String input = scan.nextLine();
        switch(input){
            case "yes":
                admin Admin = new admin();
                Admin.adminlogin();
                break;
            case "No":
                login userLogin = new login();
                userLogin.getLogin();
        }

        scan.close();
    }
}
