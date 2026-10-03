public class IfElse{
    public static void main(String[] args) {
        int age = 3;
        double balance = 0.50;
        double coffeePrice = 5.99;
        

        if(age >= 18){
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
        if(balance >= 100){
            System.out.println("You a rich bitch.");
        } else {
            System.out.println("You do not have enough balance.");
        }

        if(coffeePrice <= balance){
            System.out.println("You can buy a coffee.");
        } else {
            System.out.println("You do not have enough money to buy a coffee.");
        }

        String name = "imani";
        if(name.equals("imani")){
            System.out.println("Hello, imani!");
        } else {
            System.out.println("You are not imani.");
        }

        double expenses = 15;
        double budget = 20;
        if(expenses <= budget){
            System.out.println("You are within budget.");
        } else {
            System.out.println("You are over budget.");
        }
    }
}