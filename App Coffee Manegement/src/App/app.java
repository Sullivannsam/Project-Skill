package App;

import App.Menu.Payment.payQr;
import App.Menu.Payment.payment;


import App.Menu.menu;
import User.DataUser.userLogin;
import User.DataUser.userRegister;

import java.util.Scanner;

import static App.Menu.menu.*;


public class app {

    public static String choice;
    public static String app;
    static double price;
    public static void main(String[] args) throws InterruptedException {


        //Payment
        payment newPayment = new payment();
        newPayment.payMethod();
        System.exit(0);

        //Payment with Qr code
        payQr newQr = new payQr();
        newQr.getQr();
        System.exit(0);


        //User Register Account //Done at 1/24
        userRegister Register = new userRegister();
        Register.getRegisterAccount();


        //User login Account //Done at 1/24
        userLogin newLoginUser = new userLogin();
        newLoginUser.getLoginAccount();

        //Menu Method
        System.out.println(" ");
        menu newMenu = new menu();
        newMenu.getMenu();
        System.out.print("Enter Your Choice: ");
        Scanner scan = new Scanner(System.in);

        choice = scan.nextLine();
        if (choice.equals("1") || choice.equalsIgnoreCase("americano")) {
            menu newMenu1 = new menu();
            newMenu1.getCoffee();
            if(total >= 3 ){
                price = Americano * 3;
                System.out.println("Your Price is: " + price);
            }
            else if(total >= 2){
                price = Americano * 2;
                System.out.println("Your Price is: " + price);
            }
            else{
                price = Americano;
                System.out.println("Your Price is: " + price);
            }

        } else if (choice.equals("2") || choice.equalsIgnoreCase("milk tea")) {
            menu newMenu2 = new menu();
            newMenu2.getCoffee();
            if(total >= 3 ){
                price = milkTea * 3;
                System.out.println("Your Price is: " + price);
            }
            else if(total >= 2){
                price = milkTea * 2;
                System.out.println("Your Price is: " + price);
            }
            else{
                price = milkTea;
                System.out.println("Your Price is: " + price);
            }

        } else if (choice.equals("3") || choice.equalsIgnoreCase("hot ice latte coffee")) {
            menu newMenu3 = new menu();
            newMenu3.getCoffee();
            if(total >= 3 ){
                price = hotlatteCoffee * 3;
                System.out.println("Your Price is: " + price);
            }
            else if(total >= 2){
                price = hotlatteCoffee * 2;
                System.out.println("Your Price is: " + price);
            }
            else{
                price = hotlatteCoffee;
                System.out.println("Your Price is: " + price);
            }

        } else if (choice.equals("4") || choice.equalsIgnoreCase("normal coffee")) {
            menu newMenu4 = new menu();
            newMenu4.getCoffee();
            if(total >= 3 ){
                price = normalCoffee * 3;
                System.out.println("Your Price is: " + price);
            }
            else if(total >= 2){
                price = normalCoffee * 2;
                System.out.println("Your Price is: " + price);
            }
            else{
                price = normalCoffee;
                System.out.println("Your Price is: " + price);
            }

        } else {
            System.out.println("Invalid Choice!");
        }
        scan.close();

    }
}
