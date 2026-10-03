public class ExpenseDemo {
    public static void main(String[] args) {
        Expense coffee = new Expense("Coffee", 2.50);
        Expense lunch = new Expense("Lunch", 10.00);
        Expense book  = new Expense("book ", 12.00);

        coffee.print();
        lunch.print();
        book.print();

        System.out.println("coffee costs " + coffee.amount + " euros");
        System.out.println("lunch costs " + lunch.amount + " euros");
        System.out.println("book costs " + book.amount + " euros");

        book.amount = 15.00;
        book.print();
    }
}