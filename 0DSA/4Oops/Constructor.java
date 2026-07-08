class Daa {
    String name;
    int age;
    String dept;

    // always make constructor public, so that we can create object of the class from anywhere in the program. because the constructor automatically called from main class and it should be accessible from main class. if we make constructor private, then we cannot create object of the class from main class. so always make constructor public.

    public Daa() {
       dept = "CSE";       // default constructor function  // we initialied dept here , so no need to initialize it in main method.
    }    // constructor automatically called when we create an object of the class . we do not create object for all properties of the class, we can create object for the class and initialize the properties of the class using constructor

    public Daa(String name, int age) {     // why we write this constructor? when we already defined the prperties in class ?
        // beacause we want to initialize the properties of the class when we create an object of that class. we can pass values to the constructor to initialize the properties of the class.
        this.name = name;
        this.age = age;       // this keyword is used to refer to the current object
    }
}


// My Question is ?
// When we already defined the properties in the class , why we write constructor to initialize the properties of the class ?
// and one more thing , if we already making the Object and we there , giving the values to the properties of the class, then why we need to write constructor to initialize the properties of the class ?


/*

Answer :  

        because , we want to initialize the properties of the class when we create an object of that class. 
        we can pass values to the constructor to initialize the properties of the class.    
        
        meanse:
        




*/
