public class Methods {

    // method with no input and no result
    static void sayHello() {
        System.out.println("Welcome to my Expense Tracker!");
    }

    // method with input (parameters), no result
    static void printExpense(String name, double amount) {
        System.out.println(name + ": " + amount + " euros");
    }

    // method with input AND a result (return)
    static double calculateTotal(double[] expenses) {
        double total = 0;
        for (int i = 0; i < expenses.length; i++) {
            total = total + expenses[i];
        }
        return total;
    }

    // method that returns true or false
    static boolean isOverBudget(double total, double budget) {
        return total > budget;
    }

    static double average (double[] expenses) {
        double total = calculateTotal(expenses);
        return total / expenses.length;
    }

    public static void main(String[] args) {
        sayHello();

        printExpense("Coffee", 3.50);
        printExpense("Lunch", 8.75);

        double[] expenses = {12.50, 3.20, 45.00, 8.75};
        double total = calculateTotal(expenses);
        System.out.println("Total: " + total);


        if (isOverBudget(total, 100)) {
            System.out.println("Over budget!");
        } else {
            System.out.println("Within budget");
        }

        double avg = average(expenses);
        System.out.println("Average expense: " + avg);
    }
}
