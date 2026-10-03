public class DbTest3 {
    public static void main(String[] args) {
        Database.createTable();
        //Database.addExpense("Lunch", 10.0);

        for (Expense e : Database.getAllExpenses()) {
            e.print();
        }
    }
}