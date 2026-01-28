package Menu;

import java.util.Scanner;

// import static app;

public class menu {

    public static double Americano = 5.99;
    public static double milkTea = 4.50;
    public static double hotlatteCoffee = 6.30;
    public static double normalCoffee = 3.50;
    public static String choice;
    public static int total;

    public void getMenu(){ //This Method
        System.out.println("Welcome to Coffee Management");
        System.out.println("What can we help you today?");
        System.out.println("Menu in our Management:");
        System.out.println("1. Americano coffee");
        System.out.println("2. Milk tea");
        System.out.println("3. Hot ice latte coffee");
        System.out.println("4. Normal coffee");
    }

    public void getCoffee(){
        System.out.println("How many cups do you want?");
        System.out.println("The Maximum of Cups are 3");
        System.out.println("Input Number of Cups: ");
        Scanner cup = new Scanner(System.in);
        total = cup.nextInt();
        System.out.println("You had Order " + total + " of Cups");
        System.out.println("How many suger do you want?");
        Scanner suger = new Scanner(System.in);
        choice = suger.nextLine();
        switch(choice){
            case "0" -> System.out.println("you had add 0% of suger." + total);
            case "30" -> System.out.println("you had add 30% of suger." + total);
            case "60" -> System.out.println("you had add 60% of suger." + total);
            case "90" -> System.out.println("you had add 90% of suger." + total);
            default -> throw new IllegalStateException("Unexpected value: " + total);
        }

        cup.close();
        suger.close();
    }
}
