package restaurant.loginForm.register;

import restaurant.loginForm.Data.data;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class register {
    public void getRegister() throws InterruptedException{

        data registerData = new data();

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

            System.out.println("Register Form");

            System.out.println("Please enter your username: ");
            String username = scan.nextLine();

            System.out.println("Please enter your email: ");
            String email = scan.nextLine();

            System.out.println("Please enter your password: ");
            String password = scan.nextLine();

            if(username.isEmpty() && email.isEmpty() && password.isEmpty()) {
                System.out.println("Input must not empty");
            }

            System.out.println("Please verify your code");

            for(int i = 1; i <= 3; i++){
                Thread.sleep(1000);
                System.out.println(i);
            }

            int getVerify = 1000 + random.nextInt(9000);

            System.out.println("This is your code: " + getVerify);

            try{
                System.out.println("Please verify your code: ");
                int input = scan.nextInt();

                if(input == getVerify)
                    System.out.println("Thanks for Register account in our Restaurant");
            }
            catch(InputMismatchException e){
                System.out.println("Can not convert Character into a Number");
            }


            registerData.setUsername(username);
            registerData.setEmail(email);
            registerData.setPassword(password);



        scan.close();
    }
}
