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
        System.out.println("4. Exit");
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
        }
        
        }while(choice != 4);

        System.out.println("Goodbye!");
        scanner.close();


    
    }
}