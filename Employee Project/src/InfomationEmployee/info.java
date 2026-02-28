package InfomationEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class info {

    ArrayList<String> addList = new ArrayList<>();
    //ArrayList add Employee
    public void addList(){

        Scanner scan = new Scanner(System.in);
        //ArrayList with add employee
            System.out.println("How Many employee do you want to add?: ");
            int input = scan.nextInt();
            //To confirm user how many they want to add
            for(int i = 1; i <= input; i++){

                //How many username employee that add
                System.out.println("Please Enter username to add: ");
                Scanner scanAdd = new Scanner(System.in);
                    String addUser = scanAdd.nextLine();
                    //list add to arraylist
                    addList.add(addUser);

                scanAdd.close();
            }
        scan.close();
    }

    //ArrayList View Employee
    public void viewList(){

        ArrayList<String> viewList = new ArrayList<>();
        System.out.println("Here all the list of Employee with Username! ");
        for(String listView : addList){
            System.out.println(listView);
        }

    }

    //ArrayList remove Username or Employee
    public void removeList(){

        ArrayList<String> removeList = new ArrayList<>();
        //Accept from admin or HR to remove username of employee
        Scanner scan = new Scanner(System.in);
        System.out.println("How many username or employee to remove?: ");
        int userRemove = scan.nextInt();
        //Loop for remove
        for(int i = 0; i <= userRemove; i++){
            removeList.remove(addList);
        }

        scan.close();
    }

    //ArrayList Update Salary
    public void updateList(){
        //ArrayList Update Salary
        ArrayList<String> updateSalary = new ArrayList<>();

        //Accept from admin or HR to update salary to employee
        Scanner scan = new Scanner(System.in);
        System.out.println("How many username of employee need to update Salary?: ");
        int numUpdate = scan.nextInt();

        for(int i = 0; i <= numUpdate; i++){
            System.out.println("Enter the Index and Element: ");
            updateSalary.set(addList);
        }

        scan.close();
    }

}
