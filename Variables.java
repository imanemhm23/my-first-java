public class Variables {
    public static void main(String[] args) {
        int age = 23;               // Integer (whole number)
        double coffeePrice = 5.99;   // Double (floating point number)
        boolean likesjava = true;   // Boolean (true or false)
        String name = "imani";    // String

        System.out.println("Hello, my name is " + name );
        System.out.println("I am " + age + " years old.");
        System.out.println("My coffee costs: " + coffeePrice + " Euros");
        System.out.println(" Do I like Java: " + likesjava);


        int cups = 3;
        double totalCost = cups * coffeePrice;
        System.out.println("The total cost for " + cups + " cups of coffee is: " + totalCost + " Euros");   
        
        String city = "bochum";
        int postalCode = 44799;
        System.out.println("I live in " + city + " with postal code " + postalCode);
    }
}
