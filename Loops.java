public class Loops {
    public static void main(String[] args) {
        // For loop: use it when you know how many times

        for(int i = 1; i <= 5; i++){
            System.out.println("Round: " + i);
        }

        // While loop: use it while a condtion is true. 
        double balance = 0.50;
        double coffeePrice = 0.10;
        while(balance >= coffeePrice){
            balance = balance - coffeePrice;
            System.out.println("bought a coffee. Left : " + balance);
        }

        // array: a list of values , and a loop to go through it 
        double[] expenses = {1.50, 2.00, 2.50, 3.00};
        double total = 0;
        for(int i = 0; i < expenses.length; i++){
            total = total + expenses[i];
        }
        System.out.println("Total expenses: " + total);

        for(int i = 0; i < expenses.length; i++){
            System.out.println("Expense " + (i+1) + ": " + expenses[i]);
        }
        //do while loop: use it when you want to run the loop at least once, and then check the condition
        int count  = 1;
        do{
            System.out.println("Count : " + count );
            count ++;
        } while(count <= 2);
    }
}