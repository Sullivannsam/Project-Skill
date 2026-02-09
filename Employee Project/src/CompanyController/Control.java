package CompanyController;

import InfomationEmployee.info;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Control {
    public void adminControl() {

        Scanner scan = new Scanner(System.in);
        //Program prompt
            System.out.println("Option for Admin");
            System.out.println("1. View Employee");
            System.out.println("2. Add Salary Employee");
            System.out.println("3. Update Salary Employee");
            System.out.println("4. Remove Employee");
            System.out.println("5. Exit The Program");
            System.out.print("Please Enter Your Option: ");

            try { //Try With User Option
                int option = scan.nextInt();
                switch (option) {
                    case 1:
                        //Visit all information about employee
                        info infoView = new info();
                        infoView.viewList();
                        break;
                    case 2:
                        //Add new Employee
                        info infoAdd = new info();
                        infoAdd.addList();
                        break;
                    case 3:
                        //Update salary Employee
                        info infoUpdate = new info();
                        infoUpdate.updateList();
                        break;
                    case 4:
                        //Remove Employee
                        info infoRemove = new info();
                        infoRemove.removeList();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid Option! " + option);
                }
                //Handler Error User Option
            }catch(InputMismatchException e){
                System.out.println("Option must be Number! ");
                System.out.println("Please Try again! ");
                scan.next();
            }
        scan.close();
    }
}
