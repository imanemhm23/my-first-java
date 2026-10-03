import java.util.Scanner;
import java.util.ArrayList;
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Expense> list = new ArrayList<>();
        int choice = 0;

        do{

        System.out.println("----- Expense Tracker Menu -----");
        System.out.println("1. Add expense");
        System.out.println("2. View expenses");
        System.out.println("3. Calculate total expenses");
        System.out.println("4. Delete expense");
        System.out.println("5. Exit");
        System.out.print("your choice: ");




         choice = scanner.nextInt();
         scanner.nextLine(); // consume the newline character   

        if(choice == 1){
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Amount: ");
            double amount = scanner.nextDouble();

            list.add(new Expense(name, amount));
            System.out.println("Expense added successfully.");

        }else if(choice == 2){
            for(int i = 0; i < list.size(); i++){
                list.get(i).print();
            }

        }else if(choice == 3){
            double total = 0;
            for(int i = 0; i < list.size(); i++){
                total = total + list.get(i).amount;
            }
            System.out.println("Total expenses: " + total);
        }else if (choice ==4){
            if(list.isEmpty()){
                System.out.println("No expenses to delete.");
        }else{
            for(int i = 0; i < list.size(); i++){
                System.out.println((i+1) + " )");
                list.get(i).print();
            }
            System.out.print("Enter the number of the expense to delete: ");
            int number = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            if(number >= 1 && number <= list.size()){
                list.remove(number - 1);
                System.out.println("Expense deleted successfully.");
            } 
            else {
                System.out.println("Invalid expense number.");
            }
        }
        
        }
        else if(choice == 5){
            System.out.println("Exiting the program.");
        
        }
        
    }while(choice != 5);

        System.out.println("Goodbye!");
        scanner.close();


    
    }
}