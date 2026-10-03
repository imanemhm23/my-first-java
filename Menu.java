import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
         Scanner1 scanner = new Scanner(System.in);
        int choice = 0;

        do{

        System.out.println("----- Expense Tracker Menu -----");
        System.out.println("1. Add expense");
        System.out.println("2. View expenses");
        System.out.println("3. Calculate total expenses");
        System.out.println("4. Exit");


         choice = scanner.nextInt();     //it will change later 

        if(choice == 1){
            System.out.println("You chose to add an expense.");
        }else if(choice == 2){
            System.out.println("You chose to view expenses.");
        }else if(choice == 3){
            System.out.println("You chose to calculate total expenses.");
        }
        
        }while(choice != 4);

        System.out.println("Goodbye!");
        scanner.close();


    
    }
}