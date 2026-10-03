public class Expense {
    //fields : the data each expense hold s
    int id;
    String name;
    double amount;

    /// constructor : a special method that is called when we create an new expense
    Expense(String name, double amount){
        this.name = name;
        this.amount = amount;
    }

    //used when we read an expense From the database (it has an id)
    Expense(int id, String name, double amount){
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    //method : something an expense can do 
    void print() {
        System.out.println(name + " : " + amount + " euros");
        

    }

}