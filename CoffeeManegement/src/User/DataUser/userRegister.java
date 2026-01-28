package User.DataUser;

import User.Data.data;

import java.util.Scanner;
import java.util.Random;

public class userRegister {

    public void getRegisterAccount() throws InterruptedException {

        System.out.println("Enter Your Name: ");
        Scanner scan = new Scanner(System.in);
        String newUserName = scan.nextLine();
        //Object instance data of newDataUserName
        data newDataUserName = new data();
        newDataUserName.setName(newUserName);
        //Object instance data of newDataUserAge
        System.out.println("Enter Your Age: ");
        short newUserAge = scan.nextShort();
        data newDataUserAge = new data();
        newDataUserAge.setAge(newUserAge);
        //Object instance data of newDataUserYear (Birth)
        System.out.println("Enter Your Year Born: ");
        data newDataUserYear = new data();
        short newUserYear = scan.nextShort();
        newDataUserYear.setYear(newUserYear);
        scan.nextLine();
        //Object instance data of newDataUserEmail
        System.out.println("Enter Your Email: ");
        data newDataUserEmail = new data();
        String newUserEmail = scan.nextLine();
        newDataUserEmail.setEmail(newUserEmail);
        //Object instance data of newDataUserPassword
        System.out.println("Enter Your Password: ");
        data newDataUserPassword = new data();
        String newUserPassword = scan.nextLine();
        newDataUserPassword.setPassword(newUserPassword);
        //Object instance data of newDataUserPhone (Phone Number)
        System.out.println("Enter Your Phone number: ");
        data newDataUserPhone = new data();
        int newUserPhone = scan.nextInt();
        newDataUserPhone.setPhoneNumber(newUserPhone);

        System.out.println("You has been Create an account! ");


        System.out.println("Your Username is: " + newUserName);
//        System.out.println("Your Age is: " + newUserAge);
//        System.out.println("Your Year Born is: " + newUserYear);
        System.out.println("Your Email is: " + newUserEmail);
//        System.out.println("Your Password is: " + newUserPassword);
        System.out.println("Your Phone number is: " + newUserPhone);
        //Check if user type email correct and sent a pin code to verify an account
        if(newUserEmail.equals(newUserEmail)){
            //Thorws an InterruptedException sleep
            for(int i = 0; i <= 3; i++){
                Thread.sleep(1000);
                System.out.print("\r" + i);
            }
            //Random pin for verify account register
            Random random = new Random();
            int randomPin = 1000 + random.nextInt(9000);
            //Sample for verify by sending pin to email
            System.out.println("We has been sent you a pin to your email");
            System.out.println("Your Pin is: " + randomPin);
            System.out.println("Please Enter Your Pin: ");
            short pin = scan.nextShort();

            if(pin == randomPin){
                System.out.println("Your Verify if Correct! ");
            }
            else{
                System.out.println("Your Verify is Incorrect! ");
            }
        }

        scan.close();
    }
}
