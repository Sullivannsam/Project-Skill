package EmployeeEnroll;

import EmployeeEnroll.Information.EmployeeInformation.EmployeeAccount.account;
import EmployeeEnroll.Information.EmployeeInformation.EmployeeSalary.salary;
import EmployeeEnroll.Information.EmployeeInformation.employeeInformation;
import EmployeeEnroll.Information.information;

import java.util.InputMismatchException;
import java.util.Scanner;

public class enroll {

    static boolean isTrue = false;

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
            //Prompt Interface
            System.out.println("==========================");
            System.out.println("Welcome to Admin dashboard");
            System.out.println("All lists about Employee in Company IT");
            System.out.println("Choose your option here: ");
            System.out.println("1. Visit all employee account");
            System.out.println("2. Visit all employee information");
            System.out.println("3. Visit all employee description");
            System.out.println("4. Visit all employee Salary");
            System.out.println("==========================");

            do {
                try {
                    System.out.print("Enter Your Option: ");
                    String option = scan.nextLine();
                    switch (option) {
                        case "1":
                            account accountEmployee = new account();
                            break;
                        case "2":
                            information informationEmployee = new information();
                            break;
                        case "3":
                            employeeInformation descriptionEmployee = new employeeInformation();
                            break;
                        case "4":
                            salary employeeSalary = new salary();
                            break;
                        default:
                            System.out.println("Invalid Option: " + option);
                            break;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Please try again! ");
                    scan.nextLine();
                }
            }
            while(!isTrue);
        System.out.println("Done");
//            System.exit(0);



        scan.close();

    }
}
