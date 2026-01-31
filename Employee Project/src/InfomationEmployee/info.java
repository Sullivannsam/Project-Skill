package InfomationEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class info {
    public void addList(){
        Scanner scan = new Scanner(System.in);
        //ArrayList with add employee
            ArrayList<String> addList = new ArrayList<>();
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
}
