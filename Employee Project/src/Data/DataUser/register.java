package Data.DataUser;//package Data.DataUser;

import Data.data;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class register {
    public void getRegister()throws InterruptedException{
    //Scanner Register
    Scanner scan = new Scanner(System.in);
        //Object instance data of newData
        data newData = new data();
        //User Register Method
            System.out.print("Enter Your Username: ");
            String username = scan.nextLine();
            System.out.println("Enter Your Password: ");
            String password = scan.nextLine();
            System.out.println("Enter Your Email: ");
            String email = scan.nextLine();

            //Set username
            newData.setName(username);
            //Set user password
            newData.setPassword(password);
            //Set password
            newData.setEmail(email);
            //Verify to email and account
            Random random = new Random();
            //CountDown to sent Pin
                for(int i = 1; i <= 3; i++ ){
                    Thread.sleep(1000);
                    System.out.println("\r" + i);
                }
                //Generate Code
                int checkPin = 100 + random.nextInt(900);
                System.out.println("This is Your Pin: " + checkPin);
                System.out.print("We have been sent you a Pin into your Email");
                //Handler Exception
                try {
                    //try With User Input
                    System.out.println("Please Enter Pin to verify your Email: ");
                    int userPin = scan.nextInt();
                    //Check pin method
                    if (userPin == checkPin) {
                        System.out.println("Welcome to our Company");
                    } else {
                        System.out.println("Please try a new one!");
                    }
                }catch(InputMismatchException e){
                    //Handler Error catch
                    System.out.println("Cannot Convert Character to Number! or Missing Number");
                    scan.next();
                }

    scan.close();

    }
}
