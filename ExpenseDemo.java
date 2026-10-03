public class ExpenseDemo {
    public static void main(String[] args) {
        Expense coffee = new Expense("Coffee", 2.50);
        Expense lunch = new Expense("Lunch", 10.00);
        Expense book = new Expense("Book", 12.00);
        Expense[]list = {book ,coffee ,lunchgit};
        for(int i = 0; i < list.length; i++){
            list[i].print();
        }
        // The order matters:Create the objects (new Expense(...))
        //Put them in the array
        //loop through the array /* */

    }
}