class Kanchan {
    int accountId ;
    String type;
    double balance;
    double IncreaseBalance;

    public void setbalance(double Current_balance) {
       this.balance = Current_balance;
    //    this is a reference to the current object. It is used to distinguish instance variables (fields) from local variables or method parameters when they have the same name.
    //   In this case, 'this.balance' refers to the instance variable 'balance' of the current object, while 'balance' refers to the parameter passed to the method.
    }

    public double getbalance() {
        return balance;
    }
}






public class Encapsulation {













    public static void main(String[] args) {
        // Encapsulation       /// helps in data hiding and data abstraction.

        // Encapsulation is the process of binding the data and the methods that operate on that data within a single unit (class).
        // It helps in hiding the internal details of an object and exposing only the necessary information.
        // We implemented class Kanchan in such a way that we can access the properties of the class using setters and getters.

        Kanchan kan1 = new Kanchan();
        kan1.setbalance(1000.0);
        System.out.println("Balance: " + kan1.getbalance());
        
        


        // Abstraction



        // Polymorphism



        // Inheritance



    }
}