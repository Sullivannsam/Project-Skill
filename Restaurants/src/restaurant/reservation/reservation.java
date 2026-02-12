package restaurant.reservation;

import java.util.Random;
import java.util.Scanner;

public class reservation {
    public void getReservation() throws InterruptedException{

        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter Your Username: ");
        String username = scan.nextLine();

        System.out.println("Please Enter Your Phone number: ");
        int phoneNumber = scan.nextInt();

        System.out.println("Please Enter Your Email: ");
        String email = scan.nextLine();

        System.out.println("Please Enter Check in time: ");
        int checkIn = scan.nextInt();

        System.out.println("Please Enter Check out time: ");
        int checkOut = scan.nextInt();

        if (username.isEmpty()){
            System.out.println("username must not empty! ");
        }
        else if(scan.hasNextInt(phoneNumber)){
            System.out.println("phone number must not empty! ");
        }
        else if(email.isEmpty()){
            System.out.println("Email must not empty! ");
        }
        else if(scan.hasNextInt(checkIn)){
            System.out.println("Check in must not empty! ");
        }
        else if(scan.hasNextInt(checkOut)){
            System.out.println("Check out must not empty! ");
        }
        else{
            System.out.println("Error Reservation Form");
        }
        generateReservation();

        scan.close();
    }

    public int generateReservation() throws InterruptedException {
        Random random = new Random();
        int generateRandom = 100 + (random.nextInt(900));

        System.out.println("Please waiting your generate code Reservation! ");
        for(int i = 1; i <= 3; i++){
            Thread.sleep(1000);
            System.out.println(i);
        }
        System.out.println("Done! ");

        System.out.println("Your Reservation Code is: " + generateRandom);


        return 0;
    }
}
