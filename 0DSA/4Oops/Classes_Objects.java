// import java.util.*;
class Kanchan {
   //properties
    String Beauty;
    int skill;
    int LPApackage;
    private int Salary;

    
    // class can have methods to define any behaviour .
    void Placment() {
        System.out.println("Kanchan is placed in a good company");
    }
 


    void SalaryIncrease( int IncreasedSalary) {
        Salary = Salary + IncreasedSalary;
    }

    //setters and getters are used to access the private properties of the class.
    // we are indirectly accessing the private properties of the class using setters and getters.

    int setSalary(int Salary) {
        this.Salary = Salary;
        return Salary;
    }

    int getSalary() {
        return Salary;
    }

    // class can also have constructors to initialize the objects of the class.
    // we need constructors to initialize the properties of the class when we create an object of that class.
    // meanse when we create an object of the class, we can pass values to the constructor to initialize the properties of the class.
    // Kanchan(String Beauty, int skill, int LPApackage) {
    //     this.Beauty = Beauty;
    //     this.skill = skill;
    //     this.LPApackage = LPApackage;
    // }
    
}


    public class Classes_Objects {

    public static void main(String[] args) {
        // creating an object of the class Kanchan
        Kanchan kanchan1 = new Kanchan();
        // Kanchan.name = "kk";
        kanchan1.Beauty = "Beautiful";
        kanchan1.skill = 10;
        kanchan1.LPApackage = 10000;
        kanchan1.setSalary(10000);

        System.out.println(kanchan1.Beauty);
        System.out.println(kanchan1.skill);
        System.out.println(kanchan1.LPApackage);
        System.out.println(kanchan1.getSalary());
        
        kanchan1.Placment();
}

}






// classes 

// class is a blueprint for creating objects. It defines properties (fields) and behaviors (methods) that the objects created from the class wil l have.
//  In Java, you define a class using the 'class' keyword followed by the class name. 
// Classes can also include constructors, which are special methods used to initialize new objects.





//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


//Objects


// objects are instances of classes. They represent real-world entities and have state (attributes) and behavior (methods). 
// In Java, you create an object using the 'new' keyword followed by the class constructor. 
// Each object can have its own unique values for the properties defined in the class, allowing for encapsulation and modularity in programming.